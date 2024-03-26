package hw0325;

public class Hw0325ex09 {

	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}

	public static String foo(String s) {
		System.out.println(s);
		return s;
	}

	public static int foo(String s, int n, int i) {
		System.out.println(s +" "+ n +" "+ i);
		return n;
	}

	public static int foo(String s, int n) {
		System.out.println(s +" "+ n);
		return n;
	}

}
