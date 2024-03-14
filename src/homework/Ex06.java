package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double f = 5;
		double n = 9;
		double c = f/n;
		double F = input.nextInt();
		System.out.println(c*(F-32));
	}

}
