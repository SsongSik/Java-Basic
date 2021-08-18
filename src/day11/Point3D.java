package day11;

public class Point3D extends Point{
	int z;
	
	Point3D(){
		this(100, 200, 300);  //밑에 생성자를 호출
	}
	Point3D(int x, int y, int z) {
		super(x, y);       //Point(int x, int y)를 호출
		this.z = z;
	}

}
