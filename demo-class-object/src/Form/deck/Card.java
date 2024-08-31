package Form.deck;

import java.math.BigDecimal;

public class Card {
  private String Suit;
  private String rank;
  
  public Card (String Suit, String rank) {
    this.Suit = Suit;
    this.rank = rank;
  }

  public String getSuit(){
    return this.Suit;
  }

  public String getrank() {
    return this.rank;
  }

  public String toString() {
    return "Card("
    + "Suit=" + this.Suit
    + "rank=" + this.rank
    +")";
  }





  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffle(10);
    }





  
    
  }
