package sequence;
import java.util.Scanner;

public class Sequence01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("변수 a에 넣을 숫자 입력 : ");
		int intA = input.nextInt();
		System.out.println("변수 b에 넣을 숫자 입력 : ");
		int intB = input.nextInt();
		int intC;
		
		intC= intA;
		intA= intB;
		intB= intC;
		System.out.println("Swapping 결과 >>");
		System.out.println("변수 a의 값 = "+intA);
		System.out.println("변수 b의 값 = "+intB);
	}

}
