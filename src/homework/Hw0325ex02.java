package hw0325;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hw0325ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		switch (n) {

		case 1:
			bw.write("아주 잘했습니다.");
			bw.flush();
			break;
		case 2, 3:
			bw.write("잘했습니다.");
			bw.flush();
			break;

		case 4, 5, 6:
			bw.write("보통입니다.");
			bw.flush();
			break;

		}

	}

}
