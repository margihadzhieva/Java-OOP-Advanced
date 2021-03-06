package L08_EnumerationsAndAnnotations_Exercises.P04_CardToString;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;
    
    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }
    
    public String getCardRank() {
        return this.cardRank.name();
    }
    
    public String getCardSuit() {
        return this.cardSuit.name();
    }
    
    public int getPower(){
        return this.cardRank.getValue() + this.cardSuit.getValue();
    }
    
    @Override
    public String toString() {
        return String.format(
                "Card name: %s of %s; Card power: %d",
                this.getCardRank(),
                this.getCardSuit(),
                this.getPower()
        );
    }
}
