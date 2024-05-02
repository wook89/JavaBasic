package chap06;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		ColoredCircle cc = new ColoredCircle(10, "빨간색");
		c.show();
		cc.show();
	}

}
