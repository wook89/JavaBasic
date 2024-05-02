package chap06;

public class ForeignStudent extends Student {
	String nationality;

	public ForeignStudent(String name, int age, int sNum, String nationality) {
		super(name, age, sNum);
		this.nationality = nationality;
	}

	public ForeignStudent() {
	}

	void show() {
		System.out.println("외국학생[이름 : "+name+", 나이 : "+age+", 학번 : "+sNum+", 국적 : "+nationality+"]");
	}
}
