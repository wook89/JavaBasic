package chap02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double PI = 3.14;
		System.out.println("원기둘의 밑면 반지름은?");
		int r = input.nextInt();
		System.out.println("원기둥의 높이는?");
		int h = input.nextInt();
		System.out.println("원기둥의 부피는 : "+PI*r*h);
	}

}
