package ch06;

/**
 * @author SisolShie
 *
 *         2.請定義類別Calculator… 1個欄位: radix，表示數字系統的進位模式(預設10進位)，可接受2、8、10、16 4個方法:
 *         add()、sub()、mul()、div()，表示分別加、減、乘、除，各方法都接受2個int型態的參數，並回傳對應的結果
 *      
 *         remark:	 Integer.toString(int , 16)  vs Integer.toHexString(int)
 *      						         signed  vs unsigned (沒有正負,10進位中其值和signed相加為2^n , for int,n=32)
 */
public class Hw02 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.radix = 2;
		
		var result = cal.add(5,4); 
		//cal.add(5,4); 
		//cal.sub(5,5);
		//cal.mul(5,5);
		//cal.div(5,5);					
		System.out.println(result);
	
	}

	static class Calculator {

		int radix ;  //會被當成0

		private String ansToString(int ans) {
			String result;
			
			switch (radix) {
			case  2: result = "使用 2 進位的答案輸出為: " + Integer.toBinaryString(ans); // Integer類別
					break;
			case  8: result = "使用 8 進位的答案輸出為: " + Integer.toOctalString(ans);
					break;
			case 16: result = "使用 16 進位的答案輸出為: " + Integer.toHexString(ans);
					break;
			default :result = "使用 10 進位(預設)的答案輸出為: " + Integer.toString(ans);
					break;
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
