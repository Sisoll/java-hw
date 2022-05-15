package ch07;

/**
 * 
 * 1.請定義一形狀抽象類別Shape，有2個抽象方法… getPerimeter(): 回傳周長 getArea(): 回傳面積
 * 
 * 5.替第1題的Shape類別加入一靜態欄位PI = 3.14 並修改第2題的Circle類別，計算圓周長、圓面積時需使用此靜態欄位(PI)
 * 
 * 
 * @author SisolShie
 *
 */
public abstract class Shape {

	protected static  final double PI = 3.14;

	public abstract double getPerimeter();

	public abstract double getArea();

}
