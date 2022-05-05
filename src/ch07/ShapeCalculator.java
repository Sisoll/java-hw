package ch07;


/**
 * 
 * 續第2題，請定義一形狀計算器類別ShapeCalculator，成員如下…
 * 
 * 2個靜態欄位 (請用靜態區塊將2靜態欄位初始化) rectangle(Rectangle型態) circle(Circle型態) 
 * 
 * 4個靜態方法
 * 
 * getRectanglePerimeter(int length, int width): 回傳矩形周長 
 * getRectangleArea(int * length, int width): 回傳矩形面積 
 * getCirclePerimeter(int radius): 回傳圓形周長
 * getCircleArea(int radius): 回傳圓形面積 
 * 以上4個方法應利用欄位rectangle物件、circle物件來完成計算
 * 
 * @author SisolShie
 *
 */
public class ShapeCalculator {

	
	public static void main(String[] args) {
		System.out.println(getRectanglePerimeter(10,10));
		System.out.println(getRectangleArea(10,10));
		System.out.println(getCircleArea(10));
		System.out.println(getCirclePerimeter(10));
	}
	
	static Rectangle rectangle ;
	static Circle circle;
	
	//初始化, => new出來
	static {
		rectangle = new Rectangle();
		circle = new Circle();		
	}
	
	public static double getRectanglePerimeter(int length, int width) {
		rectangle.length = length;
		rectangle.width = width;
		return rectangle.getPerimeter();
	}

	public static double getRectangleArea(int length, int width) {
		rectangle.length = length;
		rectangle.width = width;
		return rectangle.getArea();
	}

	public static double getCirclePerimeter(int radius) {
		circle.radius = radius;
		return circle.getPerimeter();
	}

	public static double getCircleArea(int radius) {
		circle.radius = radius;
		return circle.getArea();
	}	
}
