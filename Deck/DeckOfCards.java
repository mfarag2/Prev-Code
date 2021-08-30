import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
public class DeckOfCards { 

 /* The programming projects of the Chapter 4 discussed a Card class that represents a
  * standard playing card.  Create a class called DeckOfCards that stores 52 objects of the
  * Card class.  Include methods to shuffle the deck (harder than you think), deal a card, and
  * report the number of cards left in the deck.  The shuffle method shouldn’t assume you have a
  full deck.  Create a driver class with a main method that deals each card from a shuffled deck,
  printing each card as it is dealt.
*/


   private ArrayList<Card> deck; // declare List that will store Cards
   private int deckLength;
   Random gen = new Random();


   public DeckOfCards() {
       deck = new ArrayList<Card>();
       for (int i = 0; i <= 3; i++) {
           for (int j = 2; j <= 14; j++) {
               deck.add(new Card(i, j));
           }
       }
       deckLength = 52;
   }

   public ArrayList<Card> shuffleDeck() {
/*1. First fill the array with the values in order.
2. Go through the array and exchange each element
  with the randomly chosen element in the range
  from itself to the end.
  */
       for (int i = 0; i < deckLength; i++) {
           int j = (gen.nextInt(deckLength)); // Get a random index out of 52
           Card temp; 
           Card top = deck.get(i);
           Card aap = deck.get(j);
          
           temp=top;
           top = aap;
           aap = temp;

       }
       return deck;
   }


   public Card dealCard() {
       int picked = gen.nextInt(deckLength);

       Card cardString = deck.get(picked);
       // String suitNew = cardString.toString();
       deck.remove(picked);
       deckLength--;
       return cardString;

   }

   public int printCardsLeft() {
       return deckLength;

   }
}


