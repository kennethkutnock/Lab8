import java.util.HashMap;

public class HoldHand extends Hand{
	
	private int FLUSH_NUM = 5;
	private Card card1, card2;
	
	public HoldHand(Card c1, Card c2) {
		super(new Card[] {c1, c2});
		card1 = c1;
		card2 = c2;
	}
	
	@Override
	public void addCard(Card card) {
		
	}
	
	@Override
	public Card playCard(int index) {
		return null;
	}
	
	public boolean hasFlush(Card[] community) {
		
		HashMap<Suit, Integer> help = new HashMap<Suit, Integer>();
		help.put(Suit.CLUBS, 0);
		help.put(Suit.DIAMONDS, 0);
		help.put(Suit.HEARTS, 0);
		help.put(Suit.SPADES, 0);
		
		if(help.containsKey(card1.getSuit())) {
			help.replace(card1.getSuit(), help.get(card1.getSuit()) + 1);
		}
		
		if(help.containsKey(card2.getSuit())) {
			help.replace(card2.getSuit(), help.get(card2.getSuit()) + 1);
		}
		
		for(Card c : community) {
			if(help.containsKey(c.getSuit())) {
				help.replace(c.getSuit(), help.get(c.getSuit()) + 1);
			}
		}
		
		for(var v : help.values()) {
			if(v > 4) {
				return true;
			}
		}
		
		return false;
	}
	
}
