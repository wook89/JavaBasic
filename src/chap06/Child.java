package chap06;

public class Child extends Parent {
	String name = "사도세자";
	public Child(String name) {
		this.name = name;
	}
	void print() {
		System.out.println("나는 "+name+"이다.");
	}
	public Child() {}
}
