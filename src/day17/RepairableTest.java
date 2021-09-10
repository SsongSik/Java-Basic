package day17;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine); 에러발생
	}
}
/*결과
Tank의 수리가 끝났습니다.
Dropship의 수리가 끝났습니다.
*/