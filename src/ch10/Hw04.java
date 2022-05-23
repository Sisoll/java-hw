package ch10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 4.請讀入sample1.txt內容，並用BIG5文字編碼寫出至sample2.txt
 * 
 * @author SisolShie
 */
public class Hw04 {

	public static void main(String[] args) {
		String src = "file\\sample1.txt";
		String des = "file\\sample2.txt";

		try (FileInputStream fis = new FileInputStream(src);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);

				FileOutputStream fos = new FileOutputStream(des);
				OutputStreamWriter osw = new OutputStreamWriter(fos, "BIG5");
				BufferedWriter bw = new BufferedWriter(osw);
				PrintWriter pw = new PrintWriter(bw)) {
			String line;
			while ((line = br.readLine()) != null) {
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
