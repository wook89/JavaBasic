package select;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int n = input.nextInt();
			
			if(n%2==0) {
				
				System.out.println(n+" 짝수입니다.");
			}else {
				
				System.out.println(n+" 홀수입니다.");
			}
	}

}
