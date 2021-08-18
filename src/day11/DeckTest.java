package day11;

public class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);

	}
}
/*°á°ú
kind : SPADE, number : 1
kind : CLOVER, number : 5
*/