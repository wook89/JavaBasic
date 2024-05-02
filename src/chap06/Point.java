package chap06;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x는"+x +", y는"+y;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point() {
	}
}
