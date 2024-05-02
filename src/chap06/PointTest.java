package chap06;

public class PointTest {

	public static void main(String[] args) {
		Point point = new Point(3,5);
		Point movaPoint = new MovablePoint(3,5,100,200);
		
		System.out.println(point.toString()) ;
		System.out.println(movaPoint.toString());
	}

}
