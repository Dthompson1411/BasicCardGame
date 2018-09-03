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
 * Provides the methods for a queue of Card objects.
 * 
 * Note:  The queue is implemented as a linked-list.
 */
public class Queue implements Queueable
        
{
      private Node front;
    private Node rear;
    
    /**
     * Display the Card objects stored in the queue.
     */
    @Override
    public void DisplayQueue() {
        Node temp = front;
        
        while(temp != null) {
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
    public void insert(Card card) {
        Node node = new Node(card);
        
        if(isEmpty()) {
            front = rear = node;
        }
        else {
            rear.setNext(node);
            rear = node;
        }
    }

    /**
     * Determines if the queue is empty.
     *
     * @return True if the queue is empty; otherwise, false.
     */
    @Override
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Determines if the queue is full.
     *
     * Note:  A queue implemented as a linked-list can never be full.
     * 
     * @return True if the queue is full; otherwise, false.
     */
    @Override
    public boolean isFull() {
        return false;
    }
    
    /**
     * Returns the Card object at the front of the queue.
     * 
     * Note:  The isEmpty method should be called first to prevent errors.
     * 
     * @return The Card object at the front of the queue.
     */
    @Override
    public Card peek() { // Method is not used in this program
        return null;
    }

    /**
     * Returns the value of the Card object at the specified position in the queue.
     * 
     * @param position The position of the queue at which to peek.
     * @return the value of the Card object at the specified position in the queue.
     */
    @Override
    public int peek(int position) { // Method is not used in this program
        return -1;
    }
    
    /**
     * Removes a Card object from the front of the queue.
     *
     * Note: The isEmpty method should be called first to prevent errors.
     *
     * @return The Card object that was removed.
     */
    @Override
    public Card remove() { // Method is not used in this program
        return null;
    }
    
    /**
     * Removes a Card object from the specified position in the queue.
     * 
     * Note:  The isEmpty method should be called first to prevent errors.
     * 
     * @param position The position of the queue at which to remove the Card object.
     * @return The Card object that was removed.
     */
    @Override
    public Card remove(int position) { // Method is not used in this program
        return null;
    }   

     
}
