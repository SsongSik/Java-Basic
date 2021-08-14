package day8;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.geartype = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white","auto",4);
		System.out.println("c1 : "+ c1.color+" "+ c1.geartype+" "+ c1.door);
		System.out.println("c2 : "+ c2.color+" "+ c2.geartype+" "+ c2.door);
	}
}
/*°á°ú
c1 : white auto 4
c2 : white auto 4
*/