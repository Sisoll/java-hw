package ch06;

import java.util.Arrays;
import java.util.Scanner;

// TODO     MAX MIN AVG 不能同時做!?????????
// ???????  為什麼ScoreCalculator的studentLimit不能直接抓建構子內設定的值?

public class ScoreCalculator {
	public static void main(String[] args) {

		//1.利用Student建立學生物件 st1 / st2 / st3 / st4 /st5
		Student st1 = new Student(1, "T", 50, 80, 60);
		Student st2 = new Student(2, "S", 66, 85, 93);
		Student st3 = new Student(3, "Q", 45, 68, 25);
		Student st4 = new Student(4, "A", 39, 62, 55);
		Student st5 = new Student(5, "H", 26, 90, 20);

		//2.建立ScoreCalculator物件 
		ScoreCalculator s = new ScoreCalculator();

		//3.將學生成績加入studentArray
		s.setStudentArray(s.addStudent(st1, s.getStudentCount()), s.getStudentCount()); //
		s.setStudentArray(s.addStudent(st2, s.getStudentCount()), s.getStudentCount()); //
		s.setStudentArray(s.addStudent(st3, s.getStudentCount()), s.getStudentCount()); //
		s.setStudentArray(s.addStudent(st4, s.getStudentCount()), s.getStudentCount()); //
		s.setStudentArray(s.addStudent(st5, s.getStudentCount()), s.getStudentCount()); //
			// System.out.println(Arrays.deepToString(s.getStudentArray()));
		
		
		//最高分/最低分/平均值
		// System.out.println(s.getMaxScoreStudent());
		// System.out.println(s.getMinScoreStudent());
		System.out.println(s.getAvgScore());
	}

	int aaaaa;
	private int[][] studentArray;
	private int studentCount;
	String[] nameList;
	int studentLimit = 5;  

	// 建構子
	ScoreCalculator() {
		int studentLimit = 5;
		setStudentArray(studentLimit);
		setStudentCount(0);
		nameList = new String[studentLimit];
	}

	ScoreCalculator(int studentLimit) {
		this.studentLimit = studentLimit;
		setStudentArray(studentLimit);
		setStudentCount(0);
	}

	
	//  SETTER / GETTER  --------------------------------
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
	
	//增加學生
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
		// System.out.println(studentCount + " "+ name + order);

		return arr;
	}

	//判斷科目
	public int selectObject() {
		System.out.println("請輸入科目:(chi / eng / math)");
		Scanner scanner = new Scanner(System.in);
		String obj = scanner.nextLine();
		scanner.close();

		int i = -1;
		switch (obj) {
		case "chi":
			i = 2;
			break;
		case "eng":
			i = 3;
			break;
		case "math":
			i = 4;
			break;
		default:
			break;
		}
		return i;
	}

	//找分數最大的
	public String getMaxScoreStudent() {

		int subject = this.selectObject();

		int max = this.getStudentArray()[0][subject];
		// System.out.println(max);
		int order = 0;
		for (var i = 0; i <= this.getStudentCount(); i++) {
			System.out.println(this.getStudentArray()[i][subject] + "  " + i + "  " + nameList[i]);
			if (max < this.getStudentArray()[i][subject]) {
				max = this.getStudentArray()[i][subject];
				order = i;
			}
		}
		System.out.println(order);
		String maxPerson = nameList[order];

		return maxPerson;
	}

	//找最分數最高的
	public String getMinScoreStudent() {
		int subject = this.selectObject();

		int min = this.getStudentArray()[0][subject];

		int order = 0;
		for (var i = 0; i <= this.getStudentCount(); i++) {
			System.out.println(this.getStudentArray()[i][subject] + "  " + i + "  " + nameList[i]);
			if (min > this.getStudentArray()[i][subject]) {
				min = this.getStudentArray()[i][subject];
				order = i;
			}
		}
		System.out.println(order);
		String minPerson = nameList[order];

		return minPerson;
	}

	//找平均
	public double getAvgScore() {
		double avg = 0;
		int sum = 0;
		int subject = this.selectObject();
		for (var i = 0; i < this.studentLimit; i++) {
			sum += this.getStudentArray()[i][subject];
		}
		avg = sum / this.getStudentCount();

		return avg;
	}

}