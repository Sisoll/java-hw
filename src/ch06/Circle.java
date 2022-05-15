package ch06;

/**
 * 
 * 8.請定義一個圓類別Circle 1個欄位radius(半徑) 2個方法 getPerimeter(): 回傳圓周長、getArea(): 回傳圓面積
 * 
 * @author SisolShie
 *
 */

public class Circle {
	private double radius;

	public static void main(String[] args) {
		Circle cir = new Circle();

		cir.radius = 5;
		System.out.println(cir.getArea());
	}
	
	public double getPerimeter() {
		double result = radius * 2 * Math.PI;
		return result;
	}

	public double getArea() {
		double result = radius * radius * Math.PI;
		return result;
	}
}
