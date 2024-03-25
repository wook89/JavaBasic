package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Break01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num;
		
		while(true) {
		
			num = Integer.parseInt(br.readLine());
			if(num>0) {
				break;
			}
			bw.write("0보다 큰 숫자를 입력하세요.");
			bw.flush();	
		}
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+num+"까지의 합 : "+sum);
	}

}
