package chap06;

public class Student extends Person {
	int sNum;

	public Student(String name, int age, int sNum) {
		super(name, age);
		this.sNum = sNum;
	}

	public Student() {
	}

	void show() {
		System.out.println("학생[이름 : "+name+", 나이 : "+age+", 학번 : "+sNum+"]");
	}
}
