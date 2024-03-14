package select;
import java.util.Scanner;
public class If01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max = a;
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		System.out.println("가장 큰 수는 "+max+" 입니다.");
	}

}
