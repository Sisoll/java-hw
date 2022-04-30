package ch06;

/**
 * @author SisolShie
 *
 *         2.請定義類別Calculator… 1個欄位: radix，表示數字系統的進位模式(預設10進位)，可接受2、8、10、16 4個方法:
 *         add()、sub()、mul()、div()，表示分別加、減、乘、除，各方法都接受2個int型態的參數，並回傳對應的結果
 *      
 *         remark:	 Integer.toString(int , 16)  vs Integer.toHexString(int)
 *      						         signed  vs unsigned (沒有正負)
 */
public class Hw02 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.radix = 16;
		
		cal.add(5,5); 
		cal.sub(5,5);
		cal.mul(5,5);
		cal.div(5,5);
	}

	static class Calculator {

		int radix ;   // 不給初始值,會當成一個0,如果main裡面沒給值,所以就會跑else,也就是預設為10進位的程式敘述

		private String ansToString(int ans) {
			String result;

			if (radix == 2) {
				result = Integer.toBinaryString(ans); // Integer類別
				System.out.println("使用 2 進位的答案輸出為: " + result);
			} else if (radix == 8) {
				result = Integer.toOctalString(ans);
				System.out.println("使用 8 進位的答案輸出為: " + result);
			} else if (radix == 16) {
				result = Integer.toHexString(ans);
				System.out.println("使用 16 進位的答案輸出為: " + result);
			} else {
				result = Integer.toString(ans);
				System.out.println("使用 10 進位(預設)的答案輸出為: " + result);
			}
			return result;
		}

		String add(int x, int y) {
			int ans = x + y;
			return ansToString(ans);
		}

		String sub(int x, int y) {
			int ans = x - y;
			return ansToString(ans);
		}
		String mul(int x, int y) {
			int ans = x * y;
			return ansToString(ans);
		}
		String div(int x, int y) {
			int ans = x / y;   // 只考慮整數部分,因為後面做進位的換算時只能吃int
			return ansToString(ans);
		}
	}

}
