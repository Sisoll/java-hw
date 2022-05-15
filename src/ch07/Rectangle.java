package ch07;

/**
 * 
 * 2.續第1題，定義2個Shape類別的子類別…
 * 
 * 矩形Rectangle，成員如下… 2個欄位: 長(length)、寬(width) 2個建構子: 無參數建構子、2參數建構子(length、width)
 * 多個方法: (覆寫Shape的方法) getPerimeter()、getArea()，2個欄位的Setter/Getter 圓形Circle，成員如下…
 * 1個欄位: radius(半徑) 2個建構子: 無參數建構子、1參數建構子(radius) 多個方法: (覆寫Shape的方法)
 * getPerimeter()、getArea()，radius的Setter/Getter
 * 
 * 
 * 4.替第2題的Rectangle類別加入一方法…showRectangle(char sign): 印出由參數sign組成的length *
 * width矩形
 * 
 * @author SisolShie
 *
 */

public class Rectangle extends Shape {

	public static void main(String[] args) {
		Rectangle re = new Rectangle();

		re.length = 5;
		re.width = 10;
		re.showRectangle('*');
	}

	private double length;
	private double width;

	public Rectangle() {
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		double result = length * width;
		return result;
	}

	@Override
	public double getPerimeter() {
		double result = 2 * (length + width);
		return result;
	}

	public void showRectangle(char sign) {
		for (int i = 0; i < length; i++) {
			if (i == 0 || i == (length - 1)) {
				for (int j = 0; j < width; j++) {
					System.out.print(sign);
				}
			} else {
				for (int j = 0; j < width; j++) {
					if (j == 0 || j == (width - 1)) {
						System.out.print(sign);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
