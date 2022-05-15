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

	public Adder() {
	}

	public Adder(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int add() {
		int result = x + y;
		return result;
	}
}
