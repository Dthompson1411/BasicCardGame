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
 *
 * @author davidthompson
 */
public interface Stackable
{
     /**
     * Display the Card objects stored in the stack.
     */
    public void displayStack();
    
    /**
     * Determines if the stack is empty.
     *
     * @return True if the stack is empty; otherwise, false.
     */
    public boolean isEmpty();
    
    /**
     * Determines if the stack is full.
     *
     * Note:  A stack implemented as a linked-list can never be full.
     * 
     * @return True if the stack is full; otherwise, false.
     */
    public boolean isFull();
    
    /**
     * Removes a Card object from the top of the stack.
     *
     * Note: The isEmpty method should be called first to prevent errors.
     *
     * @return the Card object at the top of the stack.
     */
    public Card pop();
    
    /**
     * Adds a Card object to the top of the stack.
     *
     * Note: The isFull method should be called first to prevent errors.
     *
     * @param card The Card object to add.
     */
    public void push(Card card);
}
