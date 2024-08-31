package Form.deck;

import java.util.Random;

public class Deck {
  private static String[] suits = new String[] {"DIAMOND", "CLUB", "HEART","SPADE"};
  private static String[] ranks = new String[] {"ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN","EIGHT","NINE", "TEN","JACK","QUEEN", "KING"};
  // Player, Deck, Card
  private Card[] cards;
 private static int length = suits.length * ranks.length;
  public Deck() {
    this.cards = new Card[suits.length * ranks.length];
    int idx = 0;
    for (String suit : suits) {
      for (String rank : ranks) {
        this.cards[idx++] = new Card(suit, rank);
      }
    }
  }

  // Behavior
  public void shuffle(int times) {
    for (int i = 0; i < times; i++){
    int idx = new Random().nextInt(length);
    Card [] cards = new Card[length];
    int count = 0;
    for (int i =idx; i < length; i++) {
      cards[count++] = this.cards[i];
    }
    for (int i = 0; i < idx; i++ ) {
      cards[count++] = this.cards[i];
    }
  }
  }

  public Card[] getcards(){
    return this.cards;
  }

}
