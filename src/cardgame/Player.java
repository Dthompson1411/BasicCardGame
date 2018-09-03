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
public class Player extends PriorityQueue
{
     public String PlayerName;
     public PriorityQueue Hand = new PriorityQueue();
     public Queue PlayedHand = new Queue();
     public int Score;
    

     public Player(String Name, Execute execute)
     {
          
     }

     public void setScore(int Score)
     {
          this.Score = Score;
     }

     public int getScore()
     {
          return Score;
     }

     public void setPlayerName(String PlayerName)
     {
          this.PlayerName = PlayerName;
     }

     

     public String getPlayerName()
     {
          return PlayerName;
     }
     
}

