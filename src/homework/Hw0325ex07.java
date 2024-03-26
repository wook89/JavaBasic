package hw0325;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hw0325ex07 {

	
	public static String input(String str) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(str+" : ");
		bw.flush();
		String val = br.readLine();
		
		return val;
		
		
	}
	public static void main(String[] args) throws IOException {

		

		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);
	}
	private static void whosWin(String c, String y) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
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
