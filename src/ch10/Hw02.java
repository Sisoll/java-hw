package ch10;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * <pre>
 * 2.請讀入jdbc-info.txt(檔案在老師這)，並寫出至第1題所建立的檔案sample1.txt
 * 
 * 3.續第2題，請在sample1.txt最後一列附加上你的學號跟姓名。不可將原內容清空!
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Hw02 {

	public static void main(String[] args) {

		String src = "file\\jdbc-info.txt"; // 兩種的斜線寫法意思一樣
		String des = "file/sample1.txt";

		///
		try (FileReader fr = new FileReader(src); FileWriter fw = new FileWriter(des, true)) {
			int data;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
				fw.write(data);
			}
			fw.write(" 謝欣崧   java018_12");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
