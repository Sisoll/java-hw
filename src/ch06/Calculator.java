package ch06;

import java.math.BigDecimal;

/**
 *
 * 2.請定義類別Calculator… 1個欄位: radix，表示數字系統的進位模式(預設10進位)，可接受2、8、10、16 4個方法:
 * add()、sub()、mul()、div()，表示分別加、減、乘、除，各方法都接受2個int型態的參數，並回傳對應的結果
 * 
 * 3.請定義類別Point，表示二維座標的點..
 * 
 * 4.欄位: x、y，表示水平位移量、垂直位移量 替第2題的類別Calculator加入..
 * 
 * 5.個欄位: p1、p2，都是Point型態 1個方法: distance()，回傳p1到p2的距離 替第2題的類別Calculator加入1個方法:
 * showDistance()，印出p1和p2的座標和2點的距離
 * 
 * 6.替第2題的類別Calculator加入1個方法:
 * getRandom()，接受2個int型態參數startNum、endNum，回傳1個介於這2個參數的亂數
 * 
 * 
 * remark.1: 
 * Integer.toString(int , 16) vs Integer.toHexString(int) signed vs
 * unsigned (沒有正負,10進位中其值和signed相加為2^n , for int,n=32)
 * 
 * remark.2:
 * return可以代替break跳出switch case
 * 
 * 
 * @author SisolShie
 * 
 */


public class Calculator {

	// main裡面為測試區塊
	public static void main(String[] args) {
		
		//System.out.println(BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)).doubleValue());
		//System.out.println(0.1+0.2);
		var cal = new Calculator(); 

		// cal.radix = 2;

		var result = cal.div(5,0);
		// cal.add(5,4);
		// cal.sub(5,5);
		// cal.mul(5,5);
		// cal.div(5,5);
		System.out.println(result);

		Point point1 = new Point();
		Point point2 = new Point();

		point1.x = 0;
		point1.y = 0;

		point2.x = 3;
		point2.y = 4;
		
		cal.p1= point1;   
		cal.p2= point2;
		
		cal.showdistance(cal.distance());
		

		System.out.println("隨機整數為 : " + cal.getRandom(10, 15));
	}

	
	
	int radix = 10 ; // 如果不給值,預設會被當成0

	Point p1;
	Point p2;

	private String ansToString(int ans) {

		switch (radix) {
		case 2:
			return "使用 2 進位的答案輸出為: " + Integer.toBinaryString(ans); // Integer類別
		case 8:
			return "使用 8 進位的答案輸出為: " + Integer.toOctalString(ans);
		case 16:
			return "使用 16 進位的答案輸出為: " + Integer.toHexString(ans);
		case 10:
			return "使用 10 進位(預設)的答案輸出為: " + ans;
		default: 
			return "error";
		}
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
		int ans = x / y; // 只考慮整數部分,因為後面做n進位的換算時只能吃int
		return ansToString(ans);
	}

	double distance() {		
		double ans = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
		System.out.println(ans);
		return ans;
	}
	
	double distance(Point p1 , Point p2) {		
		double ans = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
		System.out.println(ans);
		return ans;
	}
	

	void showdistance(double dis) {
		System.out.println("P1( "+ p1.x +","+p1.y + " ) 以及P2( "+ p2.x +","+p2.y + " ) 的距離為 : " + dis);
	}

	void showdistance(Point p1, Point p2) {
		double result = distance();
		System.out.println("P1( "+ p1.x +" , "+p1.y + " ) 以及P2( "+ p2.x +" , "+p2.y + " ) 的距離為 : " + result);
	}

	String getRandom(int startNum, int endNum) {
		String randomS = "wrong input range";
		int randomNum = 0;

		while (Math.abs(startNum - endNum) >= 2) {
			int randomPlus = (int) (Math.abs((endNum - startNum) - 1) * Math.random() + 1);

			if (startNum < endNum) {
				randomNum = startNum + randomPlus;
			} else {
				randomNum = endNum + randomPlus;
			}
			break;
		}
		randomS = Integer.toString(randomNum);
		return randomS;
	}
}
