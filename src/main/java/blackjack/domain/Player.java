package blackjack.domain;

public abstract class Player {

    String name;
    OwnedCards ownedCards;
    boolean isBlackjack;
    int money;

    public Player() {
        this.ownedCards = new OwnedCards();
    }

    public String getName() {
        return name;
    }

    public OwnedCards getOwnedCards() {
        return ownedCards;
    }

    public boolean getIsBlackjack() {
        return isBlackjack;
    }

    public void addCard(Card card) {
        ownedCards.addCard(card);
    }

    abstract boolean isPossibleToGetMoreCard();

    public void judgeBlackjack() {
        isBlackjack = ownedCards.isBlackjack();
    }
}
