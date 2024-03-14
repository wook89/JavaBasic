package select;

import java.util.Scanner;

public class StringConv {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("세 개의 숫자를 입력하세요 : ");
		
		int a = Integer.parseInt(input.next());
		int b = Integer.parseInt(input.next());
		int c = Integer.parseInt(input.next());
		//String tempA = input.next();
		//int a = Integer.parseInt(tempA);
		
		int max=a;
		
		if(b>a) {
			max = b;
		}
		if(b>c) {
			max = b;
		}
		System.out.println("가장 큰 수는 "+max+" 입니다.");
	}

}
