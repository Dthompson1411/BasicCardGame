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
public class Node implements Linkable
{
     private Node next;
    private Node previous;
    private Card card;
    
    /**
     * Initializes a Node and stores the provided Card in the Node.
     * @param card the Card to store in the Node.
     */
    public Node(Card card) {
        this.card = card;
    }
    
    /**
     * Returns the Card stored in the Node.
     * @return the Card stored in the Node.
     */
    @Override
    public Card getCard() {
        return card;
    }
    
    /**
     * Returns the node to the right of the current node.
     * @return the node to the right of the current node.
     */
    @Override
    public Node getNext() {
        return next;
    }
    
    /**
     * Returns the node to the left of the current node.
     * @return the node to the left of the current node.
     */
    @Override
    public Node getPrevious() {
        return previous;
    }
    
    /**
     * Sets the next pointer to the node to the right of the current node.
     * @param node the node to assign to the next pointer.
     */
    @Override
    public void setNext(Node node) {
        next = node;
    }
    
    /**
     * Sets the previous pointer to the node to the left of the current node.
     * @param node the node to assign to the previous pointer.
     */
    @Override
    public void setPrevious(Node node) {
        previous = node;
    }
}
