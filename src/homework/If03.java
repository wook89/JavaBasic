package select;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int n = input.nextInt();
			
			if(n<0) {
				System.out.println("음수입니다.");	
			}
			else if(n==0) {
				System.out.println("0입니다.");
			}
			else{
				System.out.println("양수입니다.");
			}
	}

}
