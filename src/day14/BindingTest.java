package day14;

public class BindingTest {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x : "+p.x);
		p.method();
		System.out.println();
		System.out.println("c.x : "+c.x);
		c.method(); 
	}
}
/*°á°ú
p.x : 100
x= 200
super.x= 100
this.x= 200

c.x : 200
x= 200
super.x= 100
this.x= 200
*/