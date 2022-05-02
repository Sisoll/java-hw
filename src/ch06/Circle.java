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
	final double PI = 3.14;

	public double getPrimeter(double radius) {
		double result = radius * 2 * PI;
		return result;
	}

	public double getArea(double radius) {
		double result = radius * radius * PI;
		return result;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
