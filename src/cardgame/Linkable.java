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
 * Provides the methods required to implement a linked list of nodes.
 * 
 * This interface MUST be implemented by a class.
 * i.e., public class Node implements Linkable {
 * 
 * @author Jim Littleton
 * @since February 14, 2014
 */
public interface Linkable
{
        /**
     * Returns the Card stored in the Node.
     * @return the Card stored in the Node.
     */
    public Card getCard();
            
    /**
     * Returns the node to the right of the current node.
     * @return the node to the right of the current node.
     */
    public Node getNext();
    
    /**
     * Returns the node to the left of the current node.
     * @return the node to the left of the current node.
     */
    public Node getPrevious();
    
    /**
     * Resets the previous and next pointers of the current node.
     */
    //public void reset();
    
    /**
     * Sets the next pointer to the node to the right of the current node.
     * @param node the node to assign to the next pointer.
     */
    public void setNext(Node node);
    
    /**
     * Sets the previous pointer to the node to the left of the current node.
     * @param node the node to assign to the previous pointer.
     */
    public void setPrevious(Node node);
} 

