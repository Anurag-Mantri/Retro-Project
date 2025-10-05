package com.Anurag.model;

public class Card {

    // Use enum for Suit and Rank for type saftey - only allow valid values
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    // Create private vriables
    private final Suit suit;
    private final Rank rank;

    // constructor
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter methods
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    // Override toString method to easily print card details
    @Override
    public String toString() {
        return rank + " of " + suit;
    }


}
