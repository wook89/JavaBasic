package chap06;

public class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;

	}
	public String toString() {
		return "x는"+getX() +", y는"+getY() + "xSpeed는 "+xSpeed + ", ySpeed는 "+ySpeed;
	}
	public MovablePoint() {
	}
}
