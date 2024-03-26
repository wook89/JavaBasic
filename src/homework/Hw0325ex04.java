package hw0325;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hw0325ex04 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				bw.write("*");
				bw.flush();
			}
			bw.write("\n");
			bw.write("\n");
			bw.flush();
		}
	}

}
