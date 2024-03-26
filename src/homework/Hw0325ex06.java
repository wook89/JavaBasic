package hw0325;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hw0325ex06 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String c = br.readLine();
		String y = br.readLine();
		
		if(c.equals("r")) {
			if(y.equals("s")) {
				bw.write("철수 : r \n영희 : s \n 철수,승 !");
				bw.flush();
			}
			else if(y.equals("p")) {
				bw.write("철수 : r \n영희 : p \n 철수,패 !");
				bw.flush();
			}
			else {
				bw.write("철수 : r \n영희 : r \n 무승부 !");
				bw.flush();
			}
		}
		else if(c.equals("s")) {
			if(y.equals("s")) {
				bw.write("철수 : s \n영희 : s \n 무승부 !");
				bw.flush();
			}
			else if(y.equals("p")) {
				bw.write("철수 : s \n영희 : p \n 철수,승 !");
				bw.flush();
			}
			else {
				bw.write("철수 : s \n영희 : r \n 철수,패 !");
				bw.flush();
			}
		}
		else {
			if(y.equals("s")) {
				bw.write("철수 : p \n영희 : s \n 철수,패 !");
				bw.flush();
			}
			else if(y.equals("p")) {
				bw.write("철수 : p \n영희 : p \n 무승부 !");
				bw.flush();
			}
			else {
				bw.write("철수 : p \n영희 : r \n 철수,승 !");
				bw.flush();
			}
		}
		bw.close();
		br.close();
		
		
	}

}
