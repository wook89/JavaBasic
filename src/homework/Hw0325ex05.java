package hw0325;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hw0325ex05 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int a = 1; a < 18; a++) {
			for (int b = 1; b < 18; b++) {
				for (int c = 1; c < 18; c++) {

					if ((a + b + c) <= 20 && ((a * a) + (b * b)) == (c * c)) {
						bw.write(a + " " + b + " " + c + "\n");
						bw.flush();
					}
				}
			}
		}
		bw.close();

	}

}
