package ch10;

/**
 * 5.續第4題，印出sample1.txt、sample2.txt的檔案大小
 * 
 * @author SisolShie
 */
public class Hw05 {

	public static void main(String[] args) {
		String src1 = "file\\sample1.txt";
		String src2 = "file\\sample2.txt";

		System.out.println("sample1.txt的檔案大小是 : " + src1.length() + " byte");
		System.out.println("sample2.txt的檔案大小是 : " + src2.length() + " byte");

	}

}
