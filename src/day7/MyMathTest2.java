package day7;

public class MyMathTest2 {

	public static void main(String[] args) {
		//클래스메소드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));

		MyMath2 mm = new MyMath2();
		
		mm.a = 200l;
		mm.b = 100l;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
	}
}
/*결과
300
100
20000
300
100
20000
*/