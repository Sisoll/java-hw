package ch07;

/**
 * 
 * 續第1題，定義2個Shape類別的子類別…
 * 
 * 矩形Rectangle，成員如下… 2個欄位: 長(length)、寬(width) 2個建構子: 無參數建構子、2參數建構子(length、width)
 * 多個方法: (覆寫Shape的方法) getPerimeter()、getArea()，2個欄位的Setter/Getter 圓形Circle，成員如下…
 * 1個欄位: radius(半徑) 2個建構子: 無參數建構子、1參數建構子(radius) 多個方法: (覆寫Shape的方法)
 * getPerimeter()、getArea()，radius的Setter/Getter
 * 
 * 
 * @author SisolShie
 *
 */
public class Circle extends Shape {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 5;
		System.out.println(circle.getArea());

		int x = 5;
		Circle cir = new Circle(x);
		System.out.println(cir.getArea());

	}

	protected int radius;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double result = this.radius * this.radius * Shape.PI;
		return result;
	}

	@Override
	public double getPerimeter() {
		double result = 2 * radius * Shape.PI;
		return result;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
