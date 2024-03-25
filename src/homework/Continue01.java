package array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Continue01 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=2;i<=9;i++) {
			if(i==4 || i==7) {
				continue;
			}
			for(int j=1;j<=9;j++) {
				bw.write(i+" X "+j+" = "+i*j+"\n");
				bw.flush();
			}
		}
		bw.close();
	}

}
