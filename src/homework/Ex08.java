package chap02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int n1 = n%10;
		int n2 = (n/10)%10;
		int n3 = (n/100)%10;
		
		
		System.out.println(n3+n2+n1);
		
	}

}
