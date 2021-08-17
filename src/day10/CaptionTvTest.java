package day10;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;    //상속받은 멤버
		ctv.channelUp();     //상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("hello world");
		ctv.caption = true;
		ctv.displayCaption("hello world");
	}
}
/*결과
11
hello world
*/