package chap06;

public class Circle {
	int radius;
	void show() {
		System.out.println("반지름이 "+radius+"인 원이다.");
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public Circle() {
		
	}
}
