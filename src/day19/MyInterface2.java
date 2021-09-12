package day19;

public interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticmethod() {
		System.out.println("staticmethod() in MyInterface2");
	}
}
