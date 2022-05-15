package ch06;

/**
 * 
 * 9.請定義一個學生類別Student..
 * 
 * 5個private欄位: no(學號)、name(姓名)、chi(國文成績)、eng(英文成績)、math(數學成績) 3個public建構子:
 * 無參數建構子、2個參數(no、name)的建構子、5個參數(no、name、chi、eng、math)的建構子 多個public方法:
 * showScores()印出所有成績、5個欄位的Setter/Getter
 * 
 * @author SisolShie
 *
 */
public class Student {

	public static void main(String[] args) {

		Student st = new Student();
		Student st0 = new Student(0, "H", 26, 90, 20);
		Student st1 = new Student(1, "T", 50, 80, 60);
		Student st2 = new Student(2, "S", 66, 85, 93);
		Student st3 = new Student(3, "Q", 45, 68, 25);
		Student st4 = new Student(4, "Q", 39, 62, 55);

		st2.showScores();
	}

	private int no;
	private String name;
	private int chi;
	private int eng;
	private int math;

	Student() {
	}

	Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	Student(int no, String name, int chi, int eng, int math) {
		this.no = no;
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		this.math = math;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChi() {
		return chi;
	}

	public void setChi(int chi) {
		this.chi = chi;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void showScores() {
		System.out.println("國文成績: " + chi + "  英文成績: " + eng + "  數學成績: " + math);

	}

}