package ch10;

import java.io.File;

/**
 * 5.續第4題，印出sample1.txt、sample2.txt的檔案大小
 * 
 * @author SisolShie
 */
public class Hw05 {

	public static void main(String[] args) {

		File file1 = new File("file\\sample1.txt");
		File file2 = new File("file\\sample2.txt");

		System.out.println("sample1.txt的檔案大小是 : " + file1.length() + " byte");
		System.out.println("sample2.txt的檔案大小是 : " + file2.length() + " byte");

	}

}
