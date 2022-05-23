package ch10;

import java.io.File;
import java.io.IOException;

/**
 * <pre>
 * 1.請使用Java原廠提供的File類別，在目錄 你的專案/file/，
 * 建立檔案 sample1.txt、sample2.txt、sample3.txt
 * exclamation:註: Eclipse Java專案的預設路徑
 * 		1. 若使用 相對路徑(非C:\這種路徑)，預設路徑 會是程式當前所在專案的路徑
 * 		2. 可用 System.getProperty(“user.dir”) 來查
 * 
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Hw01 {

	public static void main(String[] args) throws IOException {

		System.out.println(System.getProperty("user.dir"));
		String parent = System.getProperty("user.dir");

		File dir = new File(parent, "file");
		if (!dir.exists()) {
			System.out.println(dir.mkdir());
		}

		File sample1 = new File(dir, "sample1.txt");
		File sample2 = new File(dir, "sample2.txt");
		File sample3 = new File(dir, "sample3.txt");

		sample1.createNewFile();
		sample2.createNewFile();
		sample3.createNewFile();

	}

}
