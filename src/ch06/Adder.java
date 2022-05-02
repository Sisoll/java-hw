package ch06;

/**
 * 
 * 6.請定義一個加法器類別Adder.. 2個欄位 x、y 1個方法 add(): 回傳x + y的結果
 * 
 * 7.替第6題類別Adder加入2個建構子.. 無參數的建構子 2個參數x、y的建構子(用來初始化2個欄位)
 * 
 * @author SisolShie
 *
 */


public class Adder {
	private int x;
	private int y;

	int add(int x, int y) {
		int result = x + y;
		return result;
	}

	Adder() {
	}

	Adder(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
