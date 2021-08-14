package day8;

public class Car {
	String color;
	String geartype;
	int door;
	
	Car(){ 
		this("white", "auto", 4);
	}
	
	Car(Car c){
		this(c.color, c.geartype, c.door);
	}
	
	Car(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
}
