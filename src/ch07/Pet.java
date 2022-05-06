package ch07;

/**
 * 
 * 6.抽象類別Pet(寵物) 
 * 欄位: nickname(暱稱)、age(年紀)、color(毛色) 
 * 抽象方法: talk()
 * 
 * 10.定義列舉Color(毛色)，有3個列舉值: WHITE、BLACK、MIXING，
 * 並修改第6題Pet類別，欄位color的型態
 * 
 * @author SisolShie
 *
 */
abstract class Pet {

	
	String nickname;
	int age;
	Color color;
	
	abstract void talk();
	
}
