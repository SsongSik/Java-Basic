package day6;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("width = "+Card.width);
		System.out.println("height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1의 카드 종류는 "+c1.kind+","+c1.number);
		System.out.println("c2의 카드 종류는 "+c2.kind+","+c2.number);
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c2의 카드 길이와 높이는 "+c2.width+","+c2.height);
	}
}
