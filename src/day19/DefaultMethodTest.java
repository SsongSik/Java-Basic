package day19;

public class DefaultMethodTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		MyInterface.staticmethod();
		MyInterface2.staticmethod();
	}
}
/*°á°ú
method1() in Child
method2() in Parent
staticmethod() in MyInterface
staticmethod() in MyInterface2
*/