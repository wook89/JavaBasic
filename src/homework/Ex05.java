package chap02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char c = input.nextLine().charAt(0);
		int n = (int)c;
		
//		int c = (int)'C';
//		char C = (char)67;
		System.out.println((char)(n-32));
	}

}
