package ch08;

/**
 * <pre>
 * 1.請定義類別NumberParser，
 * 
 * 有2個靜態方法…
 * string2Int(String input): 將String轉成int。 方法內用Integer.parseInt()來轉換即可
 * string2Double(String input): 將String轉成double。 方法內用Double.parseDouble()來轉換即可
 * 
 * 請加入適當的try-catch區塊，轉換失敗時印出"輸入格式錯誤"，並回傳0
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class NumberParser {

	static int string2Int(String input) {
		int result = 0;
		try {
			result = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("輸入格式錯誤");
			// e.printStackTrace();
		}
		return result;
	}

	static double string2Double(String input) {
		double result = 0;

		try {
			result = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("輸入格式錯誤");
			// e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(string2Int("bbb"));
		System.out.println(string2Double("aaa"));

	}
}
