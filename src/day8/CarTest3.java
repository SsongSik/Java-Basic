package day8;

public class CarTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		
		System.out.println("c1 : "+ c1.color+" "+ c1.geartype+" "+ c1.door);
		System.out.println("c2 : "+ c2.color+" "+ c2.geartype+" "+ c2.door);
		
		c1.door = 100;
		
		System.out.println("c1 : "+ c1.color+" "+ c1.geartype+" "+ c1.door);
		System.out.println("c2 : "+ c2.color+" "+ c2.geartype+" "+ c2.door);
	}
}
/*���
c1 : white auto 4
c2 : white auto 4
c1 : white auto 100
c2 : white auto 4
*/