package day6;

public class TvTest2 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
	}
}
/*°á°ú
tvArr[0].channel=11
tvArr[1].channel=12
tvArr[2].channel=13
*/