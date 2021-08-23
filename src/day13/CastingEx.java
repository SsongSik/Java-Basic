package day13;

public class CastingEx {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe;
		//car.water() ; 에러발생. 
		fe2 = (FireEngine) car;
		fe2.water();
	}
}
/*결과
water!!
water!!
*/