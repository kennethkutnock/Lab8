
public class Card implements Comparable<Card> {

	private Rank rank;
	private Suit suit;

	public Card(Rank rank, Suit suit) {
		if (rank == null || suit == null) {
			throw new NullPointerException();
		}
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public int compareTo(Card card) {
		if (suit.compareTo(card.getSuit()) == 0) {
			return rank.compareTo(card.getRank());
		}
		return suit.compareTo(card.getSuit());
	}

	@Override
	public String toString() {
		return rank.toString() + " of " + suit.toString();
	}

}
