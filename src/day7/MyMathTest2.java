package day7;

public class MyMathTest2 {

	public static void main(String[] args) {
		//Ŭ�����޼ҵ� ȣ��. �ν��Ͻ� �������� ȣ�Ⱑ��
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
/*���
300
100
20000
300
100
20000
*/