package day12;

public class Card {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		NUMBER = num;
		KIND =kind;
	}
	
	Card(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND +" "+ NUMBER;
	}
}
