package chap06;

public class PersonTest {

	public static void main(String[] args) {
		Person[] p = {new Person("길동이",22),new Student("황진이",23,100), new ForeignStudent("Amy",30,200,"U.S.A")};
		
		for(Person ps : p) {
			ps.show();
		}
	}

}
