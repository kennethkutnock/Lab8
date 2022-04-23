import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();

		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				Card add = new Card(r, s);
				cards.add(add);
			}
		}
	}

	public Deck(Card[] cards) {
		this.cards = new ArrayList<Card>();
		for (Card pp : cards) {
			this.cards.add(pp);
		}
	}

	public Deck(Deck deck) {
		cards = new ArrayList<Card>();
		for (Card pp : deck.getCards()) {
			this.cards.add(pp);
		}
	}

	public int size() {
		return cards.size();
	}

	public Card draw() {
		if (cards.size() == 0) {
			return null;
		}
		Card draw = cards.get(0);
		cards.remove(0);
		return draw;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public List<Card> getCardsByRank(Rank rank) {
		List<Card> fun = new ArrayList<Card>();
		for (Card c : cards) {
			if (c.getRank().equals(rank)) {
				fun.add(c);
			}
		}
		return fun;
	}

	@Override
	public String toString() {
		return cards.toString();
	}

	public List<Card> getCards() {
		return List.copyOf(cards);
	}
}
