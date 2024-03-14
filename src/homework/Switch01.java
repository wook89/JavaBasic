package select;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = input.nextInt();
		
		switch (n%2) {
		
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		
		}
		
		
	}

}
