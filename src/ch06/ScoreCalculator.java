package ch06;

import java.util.Arrays;

/**
 * 
 * 10.請定義一個成績計算器類別ScoreCalculator..
 * 
 * 2個private欄位: studentArray(學生陣列)、studentCount(已加入學生人數) 
 * 2個public建構子: 
 * 無參數建構子:初始化學生人數上限為5 
 * 1個參數建構子: 傳入一int值studentLimit，表示學生人數上限 
 * 多個public方法 addStudent(學生):
 * 可加入一學生物件 
 * getMaxScoreStudent(科目):  回傳參數所指定科目的最高分學生 
 * getMinScoreStudent(科目):  回傳參數所指定科目的最低分學生 
 * getAvgScore(科目): 回傳參數所指定科目的平均分數
 * 
 * 
 * 
 * @author SisolShie
 *
 */
public class ScoreCalculator {

	public static void main (String[] args) {
		
		Student st1 = new Student(1, "A", 50, 80, 60);
		Student st2 = new Student(2, "B", 66, 85, 93);
		Student st3 = new Student(3, "C", 45, 68, 25);
		Student st4 = new Student(4, "D", 39, 62, 55);
		Student st5 = new Student(5, "E", 26, 90, 20);
		Student st6 = new Student(6, "F", 96, 77, 33);

		ScoreCalculator s = new ScoreCalculator(12); // 不給值的話上限只有5,輸入6以上的話需要給值才不會錯

		s.addStudent(st1);
		s.addStudent(st2);
		s.addStudent(st3);
		s.addStudent(st4);
		s.addStudent(st5);
		s.addStudent(st6);
		
		//System.out.println(s.getAvgScore("chi"));

		System.out.println(s.getMaxScoreStudent("chi"));
		System.out.println(s.getMinScoreStudent("chi"));
		System.out.println(s.getAvgScore("chi"));

	
	}
	
	
	
	private Student[] studentArray;
	private int studentCount;

	public ScoreCalculator() {
		studentArray = new Student[5];
	}

	public ScoreCalculator(int studentLimit) {
		studentArray = new Student[studentLimit];
	}

	public void addStudent(Student student) {
		studentArray[studentCount] = student;
		studentCount++;
	}

	public String getMaxScoreStudent(String subject) {
		Student maxStudent = null;

		int maxScore = -1;

		for (int i = 0; i < studentCount; i++) {
			Student curStudent = studentArray[i];
			switch (subject) {
			case "chi":
				int curChi = curStudent.getChi();
				if (curChi > maxScore) {
					maxScore = curChi;
					maxStudent = curStudent;
				}
			case "eng":
				int curEng = curStudent.getEng();
				if (curEng > maxScore) {
					maxScore = curEng;
					maxStudent = curStudent;
				}
			case "math":
				int curMath = curStudent.getMath();
				if (curMath > maxScore) {
					maxScore = curMath;
					maxStudent = curStudent;
				}

			}

		}
		return maxStudent.getName();
	}

	public String getMinScoreStudent(String subject) {
		Student minStudent = null;

		int minScore = 101;

		for (int i = 0; i < studentCount; i++) {
			Student curStudent = studentArray[i];
			switch (subject) {
			case "chi":
				int curChi = curStudent.getChi();
				if (curChi < minScore) {
					minScore = curChi;
					minStudent = curStudent;
				}
			case "eng":
				int curEng = curStudent.getEng();
				if (curEng < minScore) {
					minScore = curEng;
					minStudent = curStudent;
				}
			case "math":
				int curMath = curStudent.getMath();
				if (curMath < minScore) {
					minScore = curMath;
					minStudent = curStudent;
				}

			}

		}
		return minStudent.getName();
	}

	public double getAvgScore(String subject) {
		double avg = 0;
		int sum = 0;

		for (int i = 0; i < studentCount; i++) {
			Student curStudent = studentArray[i];
			int curScore = 0;
			switch (subject) {
			case "chi":
				curScore = curStudent.getChi();
				sum += curScore;
				break;
			case "eng":
				curScore = curStudent.getEng();
				sum += curScore;
				break;
			case "math":
				curScore = curStudent.getMath();
				sum += curScore;
				break;
			default:
				break;

			}
		}
		avg = (double) sum / studentCount;
		return avg;
	}

}
