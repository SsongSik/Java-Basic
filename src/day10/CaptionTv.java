package day10;

public class CaptionTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption)    //caption�� true�϶��� text�� �����ش�. 
			System.out.println(text);
	}
}
