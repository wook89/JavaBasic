package scanner;
import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		double PI = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요.(cm) : ");
		double radius = input.nextDouble();	
		
		System.out.println("원의 넓이는 "+(PI*radius*radius)+"cm입니다.");
	}

}
