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
 * Provides the methods for a stack of Card objects.
 * 
 * Note:  The stack is implemented as a linked-list.
 */
public class Stack implements Stackable
{

    
     private Node top;

     /**
      * Display the Card objects stored in the stack.
      */
     @Override
     public void displayStack()
     {
          Node temp = top;

//          System.out.print("\nDeck: ");
          while (temp != null)
          {
               System.out.format("%s", temp.getCard());
               temp = temp.getNext();
          }
          System.out.println();
     }

     /**
      * Determines if the stack is empty.
      *
      * @return True if the stack is empty; otherwise, false.
      */
     @Override
     public boolean isEmpty()
     {
          return top == null;
     }

     /**
      * Determines if the stack is full.
      *
      * Note: A stack implemented as a linked-list can never be full.
      *
      * @return True if the stack is full; otherwise, false.
      */
     @Override
     public boolean isFull()
     {
          return false;
     }

     /**
      * Removes a Card object from the top of the stack.
      *
      * Note: The isEmpty method should be called first to prevent errors.
      *
      * @return the Card object at the top of the stack.
      */
     @Override
     public Card pop()
     {
          Node temp = top;

          top = top.getNext();
          return temp.getCard();
     }

     /**
      * Adds a Card object to the top of the stack.
      *
      * Note: The isFull method should be called first to prevent errors.
      *
      * @param card The Card object to add.
      */
     @Override
     public void push(Card card)
     {
          Node temp = new Node(card);

          temp.setNext(top);
          top = temp;
     }
}
