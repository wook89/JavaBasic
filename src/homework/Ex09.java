package chap02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("전공 이수 학점 : ");
		int a = input.nextInt();
		System.out.println("교양 이수 학점 : ");
		int b = input.nextInt();
		System.out.println("일반 이수 학점 : ");
		int c = input.nextInt();
		
		
		if(a+b+c >= 140 ) {
			
			if(a>=70) {
				
				if((b>=30&&c>=30) || b+c >= 80) {
					
					System.out.println("졸업 가능");
				}
				
			}else {
				System.out.println("탈락");
			}			
		}else {
			System.out.println("탈락");
		}		
	}
}
