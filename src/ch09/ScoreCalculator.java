package ch09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * 10.請定義一個成績計算器類別ScoreCalculator..
 *
 * 2個private欄位: studentArray(學生陣列)、studentCount(已加入學生人數) 2個public建構子:
 * 無參數建構子:初始化學生人數上限為5 1個參數建構子: 傳入一int值studentLimit，表示學生人數上限 多個public方法
 * addStudent(學生): 可加入一學生物件 getMaxScoreStudent(科目): 回傳參數所指定科目的最高分學生
 * getMinScoreStudent(科目): 回傳參數所指定科目的最低分學生 getAvgScore(科目): 回傳參數所指定科目的平均分數
 *
 *
 * 9.請將第6章作業第10題的類別ScoreCalculator複製至本章的package，並完成以下事項..
 * 定義一個列舉Subject(科目)，有3個列舉值: CHI、ENG、MATH，
 * 並在類別ScoreCalculator的方法getMaxScoreStudent()、getMinScoreStudent()、getAvgScore()中使用
 *
 * 加入一個方法getTop3Student()，回傳3科目總合最高的前3名學生，請利用Comparator介面 加上 Arrays.sort()來完成此方法
 *
 * @author SisolShie
 *
 */
public class ScoreCalculator {

	public static void main(String[] args) {

		Student st1 = new Student(1, "A", 50, 80, 60);
		Student st2 = new Student(2, "B", 66, 85, 93);
		Student st3 = new Student(3, "C", 45, 68, 25);
		Student st4 = new Student(4, "D", 39, 62, 55);
		Student st5 = new Student(5, "E", 26, 90, 20);
		Student st6 = new Student(6, "F", 96, 77, 100);

		ScoreCalculator s = new ScoreCalculator(10); // 不給值的話上限只有5 ; 如果有6個以上的學生就會出錯

		s.addStudent(st1);
		s.addStudent(st2);
		s.addStudent(st3);
		s.addStudent(st4);
		s.addStudent(st5);
		s.addStudent(st6);

		// System.out.println(s.getAvgScore("chi"));

		// System.out.println(s.getMaxScoreStudent(Subject.MATH));
		// System.out.println(s.getMinScoreStudent(Subject.MATH));
		// System.out.println(s.getAvgScore(Subject.MATH));

		System.out.println(Arrays.toString(s.getTop3Student()));
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

	public String getMaxScoreStudent(Subject subject) {
		Student maxStudent = null;

		int maxScore = -1;

		for (int i = 0; i < studentCount; i++) {
			Student curStudent = studentArray[i];
			switch (subject) {
			case CHI:
				int curChi = curStudent.getChi();
				if (curChi > maxScore) {
					maxScore = curChi;
					maxStudent = curStudent;
				}
				break;
			case ENG:
				int curEng = curStudent.getEng();
				if (curEng > maxScore) {
					maxScore = curEng;
					maxStudent = curStudent;
				}
				break;
			case MATH:
				int curMath = curStudent.getMath();
				if (curMath > maxScore) {
					maxScore = curMath;
					maxStudent = curStudent;
				}
				break;
			}

		}
		return maxStudent.getName();
	}

	public String getMinScoreStudent(Subject subject) {
		Student minStudent = null;

		int minScore = 101;

		for (int i = 0; i < studentCount; i++) {
			Student curStudent = studentArray[i];
			switch (subject) {
			case CHI:
				int curChi = curStudent.getChi();
				if (curChi < minScore) {
					minScore = curChi;
					minStudent = curStudent;
				}
				break;
			case ENG:
				int curEng = curStudent.getEng();
				if (curEng < minScore) {
					minScore = curEng;
					minStudent = curStudent;
				}
				break;
			case MATH:
				int curMath = curStudent.getMath();
				if (curMath < minScore) {
					minScore = curMath;
					minStudent = curStudent;
				}
				break;
			}

		}
		return minStudent.getName();
	}

	public double getAvgScore(Subject subject) {
		double avg = 0;
		int sum = 0;

		for (int i = 0; i < studentCount; i++) {
			Student curStudent = studentArray[i];
			int curScore = 0;
			switch (subject) {
			case CHI:
				curScore = curStudent.getChi();
				sum += curScore;
				break;
			case ENG:
				curScore = curStudent.getEng();
				sum += curScore;
				break;
			case MATH:
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

	/*
	 * public String[] getTop3Student(Student...students) {
	 *
	 * //List <Student> list = new ArrayList<>();
	 *
	 * Map<String, Student> map = new HashMap() ; for (Student s : students) {
	 * map.put(s.getName(), s); }
	 *
	 *
	 * String [] arr = new String[5];
	 *
	 * return arr; }
	 */

	public String[] getTop3Student() {
        return Arrays.stream(this.studentArray)
            .filter(Objects::nonNull)
            .sorted(
                Comparator.comparing(
                    student -> student.getChi() + student.getEng() + student.getMath(),
                    Comparator.reverseOrder()))
            .limit(3)
            .map(Student::getName)
            .toArray(String[]::new);
	}

	// * 加入一個方法getTop3Student()，回傳3科目總合最高的前3名學生，請利用Comparator介面 加上
	// Arrays.sort()來完成此方法

}
