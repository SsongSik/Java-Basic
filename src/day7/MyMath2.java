package day7;

public class MyMath2 {

	long a, b;
	
	//�ν��Ͻ� ���� a, b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ� ����.
	long add() {return a+b;}
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	
	//�ν��Ͻ� ������ ������� �Ű����������� �۾��� �����ϴ�.
	static long add(long a, long b) {return a+b;}
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
}
