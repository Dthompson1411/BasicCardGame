/*
 * Author: David Thompson
 * Course: COP2551
 * Semester: Spring 2016
 * Project #:
 * Title:
 * Due Date:
 * 
 * Description:
 * 
 * 
 * 
 * 
 */
package cardgame;

/**
 * Provides the methods for a priority queue of Card objects.
 *
 * Note: The priority queue is implemented as a linked-list.
 */
public class PriorityQueue implements Queueable
{

     protected int numElems = 0;
     private Node front;
     private Node rear;

     /**
      * Display the Card objects stored in the queue.
      */
     @Override
     public void DisplayQueue()
     {
          Node temp = front;

          while (temp != null)
          {
               System.out.format("%s ", temp.getCard());
               temp = temp.getNext();
          }
     }

     /**
      * Inserts a Card object to the appropriate location of the queue.
      *
      * Note: The isFull method should be called first to prevent errors.
      *
      * @param card The Card object to insert.
      */
     @Override
     public void insert(Card card)
     {
          Node node = new Node(card);

          numElems++;
          if (isEmpty())
          {
               front = rear = node;
          }
          else
          {
               Node temp = front;
               while (temp != null && node.getCard().getValue() > temp.getCard().getValue())
               {
                    temp = temp.getNext();
               }
               if (temp == null)
               { // Insert node at the end of the linked-list
                    rear.setNext(node);
                    node.setPrevious(rear);
                    rear = node;
               }
               else if (temp.getPrevious() == null)
               { // Insert node at the front of the linked-list
                    front.setPrevious(node);
                    node.setNext(front);
                    front = node;
               }
               else
               { // Insert node in the middle of the linked-list
                    temp.getPrevious().setNext(node);
                    node.setPrevious(temp.getPrevious());
                    node.setNext(temp);
                    temp.setPrevious(node);
               }
          }
     }

     /**
      * Determines if the queue is empty.
      *
      * @return True if the queue is empty; otherwise, false.
      */
     @Override
     public boolean isEmpty()
     {
          return front == null;
     }

     /**
      * Determines if the queue is full.
      *
      * Note: A queue implemented as a linked-list can never be full.
      *
      * @return True if the queue is full; otherwise, false.
      */
     @Override
     public boolean isFull()
     {
          return false;
     }

     /**
      * Returns the Card object at the front of the queue.
      *
      * Note: The isEmpty method should be called first to prevent errors.
      *
      * @return The Card object at the front of the queue.
      */
     @Override
     public Card peek()
     {
          return front.getCard();
     }

     /**
      * Returns the value of the Card object at the specified position in the
      * queue.
      *
      * @param position The position of the queue at which to peek.
      * @return the value of the Card object at the specified position in the
      * queue.
      */
     @Override
     public int peek(int position)
     {
          int x = 0;
          Node temp = front;

          while (temp != null && x++ != position)
          {
               temp = temp.getNext();
          }
          return temp != null ? temp.getCard().getValue() : -1;
     }

     /**
      * Removes a Card object from the front of the queue.
      *
      * Note: The isEmpty method should be called first to prevent errors.
      *
      * @return The Card object that was removed.
      */
     @Override
     public Card remove()
     {
          Node temp = front;

          front = front.getNext();
          return temp.getCard();
     }

     /**
      * Removes a Card object from the specified position in the queue.
      *
      * Note: The isEmpty method should be called first to prevent errors.
      *
      * @param position The position of the queue at which to remove the Card
      * object.
      * @return The Card object that was removed.
      */
     @Override
     public Card remove(int position)
     {
          Card card = null;
          Node temp = front;

          numElems--;
          for (int x = position; x > 0 && temp != null; x--)
          {
               temp = temp.getNext();
          }
          if (temp != null)
          {
               card = temp.getCard();
               if (temp.getPrevious() != null && temp.getNext() != null)
               { // Node is in the middle of the linked list
                    temp.getNext().setPrevious(temp.getPrevious());
                    temp.getPrevious().setNext(temp.getNext());
               }
               else if (temp.getPrevious() == null && temp.getNext() != null)
               { // Node is at the front of the linked list
                    front = temp.getNext();
                    front.setPrevious(temp.getPrevious());
               }
               else if (temp.getPrevious() != null && temp.getNext() == null)
               { // Node is at the rear of the linked list
                    rear = temp.getPrevious();
                    rear.setNext(temp.getNext());
               }
               else
               { // Only a single node exists in the linked list
                    front = rear = null;
               }
          }
          return card;
     }
}
