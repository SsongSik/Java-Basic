package day11;

public class Point3D extends Point{
	int z;
	
	Point3D(){
		this(100, 200, 300);  //�ؿ� �����ڸ� ȣ��
	}
	Point3D(int x, int y, int z) {
		super(x, y);       //Point(int x, int y)�� ȣ��
		this.z = z;
	}

}
