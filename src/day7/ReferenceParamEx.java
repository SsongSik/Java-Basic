package day7;

public class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x "+d.x);
		
		change(d);
		System.out.println("main() : x "+d.x);
	}
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x "+d.x);
	}
}
/*°á°ú
main() : x 10
change() : x 1000
main() : x 1000
*/