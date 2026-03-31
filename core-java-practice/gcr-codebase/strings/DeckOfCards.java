import java.util.*;

public class DeckOfCards {

    static String[] createDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int k = 0;
        for (String s : suits)
            for (String r : ranks)
                deck[k++] = r + " of " + s;
        return deck;
    }

    static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    static void distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not possible");
            return;
        }

        int k = 0;
        for (int i = 1; i <= players; i++) {
            System.out.println("Player " + i + ":");
            for (int j = 0; j < cards; j++)
                System.out.println(deck[k++]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] deck = createDeck();
        shuffle(deck);
        distribute(deck, 4, 5);
    }
}
