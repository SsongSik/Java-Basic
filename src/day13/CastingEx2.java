package day13;

public class CastingEx2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;
	}
}
/*���
drive!!
�����߻�.
*/