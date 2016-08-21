public class Deck {
  public enum Card{
    THEFOOL("The Fool", "The Fool advises that you lighten up. Let yourself be spontaneous enough to stretch beyond the realm of logic. There is no advantage to be gained by thinking you possess the knowledge, power, or control to direct reality. Open and receive without question, instead of trying to manage what's happening right now. The Fool has no ambition to manipulate a specific outcome. Just be happy to be part of the whole."),
    THEEMPEROR("The Emperor", "The Emperor suggests that you have the necessary abilities to be the final authority. This situation is an opportunity to showcase your competence and skill. Act with the confidence of someone who knows how to take care of business."),
    STRENGTH("Strength", "Demand and expect the same from others who have some power in this situation. You cannot challenge them to live to a higher standard if you, yourself, have not yet done so. Influence others by setting an example of integrity. Your self-esteem will increase to the degree that you succeed in your efforts.");
    String name;
    String description;
    Card(String name, String description) {
      this.name = name;
      this.description = description;
    }
    public String toString() { return name+"\n"+description; }
  }
  private Card[] deck = new Card[]{ Card.THEFOOL, Card.THEEMPEROR, Card.STRENGTH };
  private int seed;
  Deck(int seed) {
    this.seed = seed;
  }
  public Card draw() {
    return deck[(int)(Math.random()*deck.length)];
  }
}
