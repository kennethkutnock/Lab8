import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private ArrayList<Card> cards = new ArrayList<Card>();

	public Hand(Card[] cards) {
		for (Card dance : cards) {
			this.cards.add(dance);
		}
	}

	public int size() {
		return cards.size();
	}

	public Card getCard(int index) {
		return cards.get(index);
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public Card playCard(int index) {
		if (cards.size() == 0) {
			return null;
		}
		Card play = cards.get(index);
		cards.remove(index);
		return play;
	}

	public void sort() {
		Collections.sort(cards);
	}

	public boolean isSorted() {
		ArrayList<Card> test = new ArrayList<Card>();
		for (Card fun : cards) {
			test.add(fun);
		}
		Collections.sort(test);
		return cards.equals(test);
	}

	@Override
	public String toString() {
		return cards.toString();
	}

}
