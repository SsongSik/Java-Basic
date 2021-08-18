package day11;

public class Child extends Parent{
//	int x = 20;
	int y = 30;
	int z = x + y;
	
	
	void method() {
		System.out.println("x="+x);
		System.out.println(z);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
/*°á°ú
x=20
this.x=20
super.x=10
*/
