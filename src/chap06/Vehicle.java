package chap06;

public class Vehicle {
	String color;
	int speed;

	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public Vehicle() {
	}

	void show() {
		System.out.println("자동차 색상 : " + color + "\n자동차 속도 : " + speed);
	}
}
