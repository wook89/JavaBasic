package scanner;
import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("정수 타입 숫자를 입력하세요 : ");
		//String intNum = input.nextLine();
		int intNum = input.nextInt();
		System.out.print("실수 타입 숫자를 입력하세요 : ");
		double doubleNum = input.nextDouble();
		
		System.out.println(intNum+" + "+doubleNum+ " = "+ (intNum+doubleNum));
		System.out.println(intNum+" - "+doubleNum+ " = "+ (intNum-doubleNum));
		System.out.println(intNum+" * "+doubleNum+ " = "+ (intNum*doubleNum));
		System.out.println(intNum+" / "+doubleNum+ " = "+ (intNum/doubleNum));

		
	}

}
