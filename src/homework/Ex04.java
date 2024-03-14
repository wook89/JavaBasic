package chap02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("초 단위 정수를 입력하세요 :");
		int n = input.nextInt();
		int h = n/3600;
		int m = (n%3600)/60;
		int s = ((n%3600)%60);
		
		System.out.println(h+"시간 "+m+"분 "+s+"초");
	}

}
