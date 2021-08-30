public class Card {
    private String rank;
    private String suit;
 
    // Kinds of suits
    public Card(int s, int r) {
        if (s == 0)
            suit = "Spades";
        else if (s == 1)
            suit = "Diamonds";
        else if (s == 2)
            suit = "Clubs";
        else
            suit = "Hearts";
 
 
        if (r == 11)
            rank = "Jack";
        else if (r == 12)
            rank = "Queen";
        else if (r == 13)
            rank = "King";
        else if (r == 14)
            rank = "Ace";
        else
            rank = "" + r;
    }
    
    public String returnRank() {
      return rank; 
    }
 
    public String toString() {
        return rank + " of " + suit;
    }
 }
 
 
 
 