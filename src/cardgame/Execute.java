/*
 * Author: David Thompson
 *
 * 
 * Description: Hearts Game programed for experience in Java Programming.
  
 */
package cardgame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Standard entry point for program. Will control the game play and serve as
 * entry / exit point to game.
 *
 * @author davidthompson
 */
public class Execute
{

     //Initialize deck and Players
     public int NumPlayers;
     public Deck GameDeck = new Deck();
     Player[] GamePlayer = new Player[4];
     Scanner myscanner = new Scanner(System.in);
     public Deck ShuffledDeck = new Deck();
     ArrayList<Card> myDeck = new ArrayList<Card>();

     public void Exectue()
     {

          GamePlayer[0] = new Player("Player 1", this);
          GamePlayer[1] = new Player("Player 2", this);
          GamePlayer[2] = new Player("Player 3", this);
          GamePlayer[3] = new Player("Player 4", this);

          //Input the deck
          readFile("Cards.input.txt");
          this.GameDeck = getDeck();

          //Ask How many players will play
          System.out.printf("Enter the Number of players between 1 and 4:\n");
          NumPlayers = myscanner.nextInt();

          if (NumPlayers < 1 || NumPlayers > 4)
          {
               System.out.printf("Please enter a valid number. \n");
          }
          switch (NumPlayers)
          {
               case 2:
                    System.out.printf("Please enter Player 1's name.\n");
                    GamePlayer[0].setPlayerName(this.myscanner.next());
                    System.out.printf("Please enter Player 2's name.\n");
                    GamePlayer[1].setPlayerName(this.myscanner.next());
                    GamePlayer[2].setPlayerName("Computer Player 3");
                    GamePlayer[3].setPlayerName("Computer Player 4");
                    break;
               case 3:
                    System.out.printf("Please enter Player 1's name.\n");
                    GamePlayer[0].setPlayerName(this.myscanner.next());
                    System.out.printf("Please enter Player 2's name.\n");
                    GamePlayer[1].setPlayerName(this.myscanner.next());
                    System.out.printf("Please enter Player 3's name.\n");
                    GamePlayer[2].setPlayerName(this.myscanner.next());
                    GamePlayer[3].setPlayerName("Computer Player 4");
                    break;

               case 4:
                    System.out.printf("Please enter Player 1's name.\n");
                    GamePlayer[0].setPlayerName(this.myscanner.next());
                    System.out.printf("Please enter Player 2's name.\n");
                    GamePlayer[1].setPlayerName(this.myscanner.next());
                    System.out.printf("Please enter Player 3's name.\n");
                    GamePlayer[2].setPlayerName(this.myscanner.next());
                    System.out.printf("Please enter Player 4's name.\n");
                    GamePlayer[3].setPlayerName(this.myscanner.next());
                    break;
               default:
                    System.out.printf("Please enter Player 1's name.\n");
                    GamePlayer[0].setPlayerName(this.myscanner.next());
                    GamePlayer[1].setPlayerName("Computer Player 2");
                    GamePlayer[2].setPlayerName("Computer Player 3");
                    GamePlayer[3].setPlayerName("Computer Player 4");
                    break;

          }

           System.out.println();
           System.out.println();
          
          
          System.out.printf("Deck before shuffle.\n");
          DisplayList(myDeck);
          
          Shuffle(myDeck);
          System.out.println();
                
          System.out.printf("After Shuffle.\n");
          DisplayList(myDeck);
          
          System.out.println();
          System.out.printf("Stack loaded with shuffled deck:\n");
         
          LoadStack(myDeck);
          GameDeck.displayStack();

          PlayGame();
     }

     public void PlayGame()
     {

          Deal(GameDeck);

          System.out.printf("%s hand is:\n", GamePlayer[0].getPlayerName());
          GamePlayer[0].Hand.DisplayQueue();
          System.out.println();
          System.out.println();
          System.out.printf("%s hand is:\n", GamePlayer[1].getPlayerName());
          GamePlayer[1].Hand.DisplayQueue();
          System.out.println();
          System.out.println();
          System.out.printf("%s hand is:\n", GamePlayer[2].getPlayerName());
          GamePlayer[2].Hand.DisplayQueue();
          System.out.println();
          System.out.println();
          System.out.printf("%s hand is:\n", GamePlayer[3].getPlayerName());
          GamePlayer[3].Hand.DisplayQueue();
          System.out.println();
          System.out.println();
     }

     /**
      * Returns the Deck object.
      *
      * @return the Deck object.
      */
     public Deck getDeck()
     {
          return GameDeck;

     }

     public void Deal(Deck GameDeck)
     {

          while (!GameDeck.isEmpty())
          {

               for (int i = 0; i < GamePlayer.length; i++)
               {
                    GamePlayer[i].Hand.insert(GameDeck.pop());
               }
          }
     }

     /**
      * Reads data from the specified file into the program.
      *
      * @param filename the name of the data file.
      */
     private void readFile(String filename)
     {

          try
          {
               String input;

               BufferedReader readFile = new BufferedReader(new FileReader(filename));
               while ((input = readFile.readLine()) != null)
               {
                    if (!GameDeck.isFull())
                    {
   
                         myDeck.add(new Card(input));

                    }

               }
          }

          catch (FileNotFoundException fnfe)
          { // Display error message the the specified file was not found

               System.out.format("Specified file was not found!\n");
          }
          catch (IOException ioe)
          {
               System.out.format("There was an unexplained error!");
          }
     }

     //Used to load the file into an array list to shuffle the deck.  From the array list
     //the deck will be shuffled and loaded onto the stack.
     //
     public void DisplayList(List myDeck)
     {
//          System.out.printf("myDeck contains:");
          for (int i = 0; i < myDeck.size(); i++)
          {
               System.out.printf("%s", myDeck.get(i));
               
          }
     }

     //Shuffle the deck and push it onto the stack for dealing.
     //
     public void Shuffle(List myDeck)
     {
          Collections.shuffle(myDeck);

     }

     //Load the shuffled deck onto the stack.  
     public void LoadStack(List myDeck)
     {
          for (int i = 0; i < myDeck.size(); i++)
          {
               GameDeck.push((Card) myDeck.get(i));

          }
     }

}
  


    
