package sequence;
import java.util.Scanner;

public class Sequence02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요(원) : ");
		int intNum = input.nextInt();
		
		int n500 = intNum/500;
		int n100 = (intNum%500)/100;
		
		System.out.println(">> 500원 동전 "+n500+"개와 100원동전 "+n100+"개가 필요합니다.");
	}

}
