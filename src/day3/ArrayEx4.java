package day3;

public class ArrayEx4 {

	public static void main(String[] args) {
		char[] abc = {'a', 'b', 'c', 'd'};
		char[] num = {'1', '2' ,'3', '4', '5','6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		//�迭 abc�� num�� ������ �ϳ��� �迭 result�� �����.
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//�迭 abc�� �迭 num�� ù��° ��ġ���� �迭 abc�� ���̸�ŭ ����
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//num�� �ε��� 6 ��ġ�� 3���� ����
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
