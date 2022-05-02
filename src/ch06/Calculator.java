package ch06;

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
 * remark: Integer.toString(int , 16) vs Integer.toHexString(int) signed vs
 * unsigned (沒有正負,10進位中其值和signed相加為2^n , for int,n=32)
 * 
 * @author SisolShie
 * 
 * 
 */

class Point {
	double x;
	double y;
}

public class Calculator {

	//main裡面為測試區塊
	public static void main(String[] args) {

		Calculator cal = new Calculator(); // 若有定義建構子,則必須直接在這裡輸入欄位的"值"

		// cal.radix = 2;

		var result = cal.add(5, 4);
		// cal.add(5,4);
		// cal.sub(5,5);
		// cal.mul(5,5);
		// cal.div(5,5);
		System.out.println(result);

		Point p1 = new Point();
		Point p2 = new Point();

		p1.x = 0;
		p1.y = 0;

		p2.x = 3;
		p2.y = 4;

		cal.showdistance(cal.distance(p1, p2));
		cal.showdistance(p1,p2);

		System.out.println("隨機整數為 : " + cal.getRandom(10, 15));
	}

	
	int radix; // 會被當成0

	Point p1;
	Point p2;

	private String ansToString(int ans) {
		String result;

		switch (radix) {
		case 2:
			result = "使用 2 進位的答案輸出為: " + Integer.toBinaryString(ans); // Integer類別
			break;
		case 8:
			result = "使用 8 進位的答案輸出為: " + Integer.toOctalString(ans);
			break;
		case 16:
			result = "使用 16 進位的答案輸出為: " + Integer.toHexString(ans);
			break;
		default:
			result = "使用 10 進位(預設)的答案輸出為: " + Integer.toString(ans);
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
		int ans = x / y; // 只考慮整數部分,因為後面做進位的換算時只能吃int
		return ansToString(ans);
	}

	double distance(Point p1, Point p2) {
		double xDistance = Math.abs(p1.x - p2.x);
		double yDistance = Math.abs(p1.y - p2.y);
		double ans = Math.sqrt(xDistance * xDistance + yDistance * yDistance);
		System.out.println(ans);
		return ans;
	}

	void showdistance(double dis) {
		System.out.println("兩點的距離為 : " + dis);
	}

	void showdistance(Point p1, Point p2) {
		double result = distance(p1, p2);
		System.out.println("兩點的距離為 " + result);
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
