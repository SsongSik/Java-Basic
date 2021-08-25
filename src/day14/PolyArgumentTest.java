package day14;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv t = new Tv();
		
		b.buy(t);
		b.buy(new Computer());
		b.refund(t);
		b.summary();
		
//		System.out.println("현재 남은 돈은 "+b.money + "만원입니다.");
//		System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다.");
	}
}
/*결과
Tv을/를 구입하셨습니다.
Computer을/를 구입하셨습니다.
Tv를 반품하셨습니다.
구매하신 총 금액은 200만원입니다
구매하신 제품은 Computer입니다.
*/