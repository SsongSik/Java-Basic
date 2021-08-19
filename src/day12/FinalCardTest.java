package day12;

public class FinalCardTest {

	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
		//c.NUMBER = 5;    에러발생
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}
/*결과
HEART
10
HEART 10
*/
