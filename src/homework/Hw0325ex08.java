package hw0325;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hw0325ex08 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write(factorial(5) + "");
		bw.flush();
	}

	static int factorial(int n) {

		switch (n) {

		case 5: {
			return 5 * 4 * 3 * 2 * 1;
		}

		}

		return n;
	}

}
