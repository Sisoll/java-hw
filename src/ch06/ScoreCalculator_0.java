package ch06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 10.請定義一個成績計算器類別ScoreCalculator..
 * 
 * 2個private欄位: studentArray(學生陣列)、studentCount(已加入學生人數) 
 * 2個public建構子: 無參數建構子:初始化學生人數上限為5 1個參數建構子: 傳入一int值studentLimit，表示學生人數上限 
 * 多個public方法 addStudent(學生):
 * 可加入一學生物件 
 * getMaxScoreStudent(科目):  回傳參數所指定科目的最高分學生 
 * getMinScoreStudent(科目):  回傳參數所指定科目的最低分學生 
 * getAvgScore(科目): 回傳參數所指定科目的平均分數
 * 
 * 
 * @author SisolShie
 * 
 */
public class ScoreCalculator_0 {
	
	public static void main(String[] args) {

		// 1.利用Student建立學生物件 st1 / st2 / st3 / st4 /st5
		//  科目依序為 chi , eng , math
		Student st1 = new Student(1, "A", 50, 80, 60);
		Student st2 = new Student(2, "B", 66, 85, 93);
		Student st3 = new Student(3, "C", 45, 68, 25);
		Student st4 = new Student(4, "D", 39, 62, 55);
		Student st5 = new Student(5, "E", 26, 90, 20);
		Student st6 = new Student(6, "F", 96, 77, 33);

		// 2.建立ScoreCalculator物件
		ScoreCalculator_0 s = new ScoreCalculator_0(6); // 不給值的話上限只有5,輸入6以上的話需要給值才不會錯

		// 3.將學生成績加入studentArray
		// 呼叫 setStudentArray 中 輸入兩個參數(陣列 , 位置)的方法
		// 其中陣列的產生是呼叫 addStudent 中 需要 (學生物件 , 位置) 的方法
		s.setStudentArray(s.addStudent(st1, s.getStudentCount()), s.getStudentCount());
		s.setStudentArray(s.addStudent(st2, s.getStudentCount()), s.getStudentCount());
		s.setStudentArray(s.addStudent(st3, s.getStudentCount()), s.getStudentCount());
		s.setStudentArray(s.addStudent(st4, s.getStudentCount()), s.getStudentCount());
		s.setStudentArray(s.addStudent(st5, s.getStudentCount()), s.getStudentCount());
		s.setStudentArray(s.addStudent(st6, s.getStudentCount()), s.getStudentCount());

		// 最高分/最低分/平均值 , 限定字串為 chi , eng , math
		System.out.println(s.getMaxScoreStudent("chi"));
		System.out.println(s.getMinScoreStudent("chi"));
		System.out.println(s.getAvgScore("chi"));

	}

	
	// field -------------------------

	private int[][] studentArray;
	private int studentCount;
	String[] nameList;
	int studentLimit;

	// 建構子 -------------------------------------
	ScoreCalculator_0() {
		int studentLimit = 5;
		this.studentLimit = studentLimit;
		setStudentArray(studentLimit);
		setStudentCount(0);
		nameList = new String[studentLimit];
	}

	ScoreCalculator_0(int studentLimit) {
		this.studentLimit = studentLimit;
		setStudentArray(studentLimit);
		setStudentCount(0);
		nameList = new String[studentLimit];
	}

	// SETTER / GETTER --------------------------------
	public int[][] getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(int studentLimit) {
		
		int[][] studentArray = new int[studentLimit][5];
		
		for (var i = 0; i < studentLimit; i++) {
			for (var j = 0; j < 5; j++) {
				studentArray[i][j] = 0;
			}
		}
		this.studentArray = studentArray;
	}

	public void setStudentArray() {
		
		var studentLimit = 5;
		int[][] studentArray = new int[studentLimit][5];
		
		for (var i = 0; i < studentLimit; i++) {
			for (var j = 0; j < 5; j++) {
				studentArray[i][j] = 0;
			}
		}
		this.studentArray = studentArray;
	}

	public void setStudentArray(int[] arr, int studentCount) {
		for (var i = 0; i < 5; i++) {
			studentArray[studentCount][i] = arr[i];
		}
		this.studentArray[studentCount] = studentArray[studentCount];
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		if (this.studentArray[studentCount][1] != 0) {
			studentCount++;
		}
		this.studentCount = studentCount;
	}

	// METHOD -------------------------------------------

	// 增加學生
	public int[] addStudent(Student student, int studentCount) {

		this.setStudentCount(studentCount);
		int no, chi, eng, math;
		String name;
		no = student.getNo();
		name = student.getName();
		chi = student.getChi();
		eng = student.getEng();
		math = student.getMath();
		int[] arr = new int[] { studentCount, no, chi, eng, math };
		int order = this.getStudentCount();
		nameList[order] = name;
		
		return arr;
	}

	// 判斷科目所在陣列的column位置
	public int selectSubject(String subject) {
		
		String sub = subject ;
		
		int i = -1;
		switch (sub) {
		case "chi": i = 2;
			break;
		case "eng":	i = 3;
			break;
		case "math": i = 4;
			break;
		default:
			break;
		}
		
		return i;
	}

	// 找分數最大的
	public String getMaxScoreStudent(String sub) {

		int subject = this.selectSubject(sub);
		int max = this.getStudentArray()[0][subject];
		int order = 0;
		
		for (var i = 0; i <= this.getStudentCount(); i++) {
			if (max < this.getStudentArray()[i][subject]) {
				max = this.getStudentArray()[i][subject];
				order = i;
			}
		}
		String maxPerson = nameList[order];

		return sub + "分數最高的是 : " + maxPerson;
	}

	// 找最分數最高的
	public String getMinScoreStudent(String sub) {
		
		int subject = this.selectSubject(sub);
		int min = this.getStudentArray()[0][subject];
		int order = 0;
		
		for (var i = 0; i <= this.getStudentCount(); i++) {
			if (min > this.getStudentArray()[i][subject]) {
				min = this.getStudentArray()[i][subject];
				order = i;
			}
		}
		String minPerson = nameList[order];

		return sub + "科目中分數最低的是 : " + minPerson;
	}

	// 找平均
	public String getAvgScore(String sub) {
		
		String avg = "";
		double sum = 0;
		int subject = this.selectSubject(sub);
		
		for (var i = 0; i < this.studentLimit; i++) {
			sum += this.getStudentArray()[i][subject];
		}
		avg = Double.toString((sum / (this.getStudentCount() + 1) ));

		return sub + "科目的平均成績是 : " + avg;
	}

}