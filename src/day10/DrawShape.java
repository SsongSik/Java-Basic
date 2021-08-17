package day10;

public class DrawShape {

	public static void main(String[] args) {
		Point[] p = {
						new Point(100, 100),
						new Point(140, 50),
						new Point(200, 100)
		};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);
		
		t.draw();
		c.draw();
	}
}
/*°á°ú
[p1=(100,100), p2=(140,50), p3=(200,100), color=black]
[center=(150, 150), r=50, color=black]
*/