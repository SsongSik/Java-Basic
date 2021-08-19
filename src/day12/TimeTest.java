package day12;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		//t.hour = 13; 에러발생
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}
}
/*결과
12:35:30
13:35:30
*/