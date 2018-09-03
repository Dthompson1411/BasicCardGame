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
public class Card extends CardData
{
     public int value;
     public String face;
     public String suit;

     /**
      * Initializes the Card object
      *
      * @param card An integer value (0 to 51) that identifies the card.
      */
     public Card(String card)
     {
          value = Integer.parseInt(card);
          face = generateFace(Integer.parseInt(card));
          suit = generateSuit(Integer.parseInt(card), true);

     }

     /**
      * Returns the face of the card.
      *
      * @return the face of the card.
      */
     public String getFace()
     {
          return face;

     }

     /**
      * Returns the value of the card. Note: The value is an integer value (0 to
      * 12) that identifies all of the cards of the same face value.
      *
      * @return the value of the card.
      */
     public int getValue()
     {
          return value;

     }

     /**
      * Returns a String value containing the face and suit of the card.
      *
      * @return a String value containing the face and suit of the card.
      */
     @Override
     public String toString()
     {
          
          return face + suit;
          

     } 
}
