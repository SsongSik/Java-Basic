package day13;

public class instanceofEx {

	public static void main(String[] args) {
		Car car = new Car();
//		doWork(car);
		FireEngine fe = new FireEngine();
		
		if(fe instanceof Car) {
			System.out.println("hello");
			car = fe;
		}
	}
	static void doWork(Car c) {
		if(c instanceof FireEngine) {
			FireEngine fe = (FireEngine)c;
			fe.water();
		}
	}
	
}
