package hw0325;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hw0325ex03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		do {
			bw.write("양의 정수를 입력하세요.\n");
			bw.flush();
			n = Integer.parseInt(br.readLine());

		} while (n < 1);
		int sum = 0;
		for (int i = 1; i <= n; i++) {
				if(i%2==0) {
					sum+=i;
				}
		}
		bw.write("입력한 양의 정수 중에서 짝수의 합은 : "+sum);
		bw.flush();

	}
}
