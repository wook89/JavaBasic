package chap02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int x = input.nextInt();
		
		if(x%4==0 && x%5==0) 
		{
			System.out.println(true);	
		}else 
		{
			System.out.println(false);
		}
		if(x%4==0 || x%5==0) 
		{
			System.out.println(true);
		}else 
		{
			System.out.println(false);
		}
		if(x%4==0 || x%5==0) {
			
			if(x%4==0&&x%5==0){
				System.out.println(false);
				}
			else {
				System.out.println(true);
			}
		}

	}
}
