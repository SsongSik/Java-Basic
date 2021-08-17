package day10;

public class CaptionTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption)    //caption이 true일때만 text를 보여준다. 
			System.out.println(text);
	}
}
