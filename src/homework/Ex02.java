package chap02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int n = input.nextInt();
		
		System.out.println(n+"의 제곱은 "+n*n);
		
	}

}
