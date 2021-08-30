public class DeckTester {
    public static void main (String[]args) {
      DeckOfCards myDeck = new DeckOfCards();
      myDeck.shuffleDeck(); 
      System.out.println(myDeck.dealCard()); 
      System.out.println(myDeck.printCardsLeft()); 
    }
  }
  
  /* > run DeckTester
  5 of Hearts
  51
  > 
  */ 