package day14;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv t = new Tv();
		
		b.buy(t);
		b.buy(new Computer());
		b.refund(t);
		b.summary();
		
//		System.out.println("���� ���� ���� "+b.money + "�����Դϴ�.");
//		System.out.println("���� ���ʽ� ������ "+b.bonusPoint+"���Դϴ�.");
	}
}
/*���
Tv��/�� �����ϼ̽��ϴ�.
Computer��/�� �����ϼ̽��ϴ�.
Tv�� ��ǰ�ϼ̽��ϴ�.
�����Ͻ� �� �ݾ��� 200�����Դϴ�
�����Ͻ� ��ǰ�� Computer�Դϴ�.
*/