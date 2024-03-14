package select;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		char grade; 
		if(n>=90) {
			//System.out.println("A");
			grade = 'A';
		}
		else if(n>=80) {
			//System.out.println("B");
			grade ='B';
		}
		else if(n>=70) {
			//System.out.println("C");
			grade ='C';
		}
		else if(n>=60) {
			//System.out.println("D");
			grade ='D';
		}
		else {
			//System.out.println("F");
			grade ='F';
		}
		System.out.println("학점: "+grade);
	}

}
