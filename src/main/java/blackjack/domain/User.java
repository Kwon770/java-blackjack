package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    String name;
    List<Card> ownedCards = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<Card> getOwnedCards() {
        return this.ownedCards;
    }

    public void addCard(Card card) {
        ownedCards.add(card);
    }
}
