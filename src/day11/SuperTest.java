package day11;

public class SuperTest {
	public static void main(String args[]) {
		Child c = new Child();
		c.method();
		System.out.println(c.x);
	}
}
/*���
x=10
this.x=10
super.x=10
*/