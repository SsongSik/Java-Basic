package day10;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;    //��ӹ��� ���
		ctv.channelUp();     //��ӹ��� ���
		System.out.println(ctv.channel);
		ctv.displayCaption("hello world");
		ctv.caption = true;
		ctv.displayCaption("hello world");
	}
}
/*���
11
hello world
*/