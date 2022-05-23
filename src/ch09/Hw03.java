package ch09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * {
 * 
 * @Question 為什麼會自己排列? }
 * 
 *           <pre>
 *  
 * 3.有一陣列如下..
 * String[] names = {"William", "Lee", "Ethan", "Vera","Reds", "Lee", "William", "Ethan"};
 * 請利用Collection家族的集合類別，將names加入該集合後可去除重複名字
 *           </pre>
 * 
 *           {
 * @summary 如果要用set去針對物件裡面的內容也去檢查是否有重複 , 如果有實作compareTo的話,重複條件為其"比較的對象"
 *          (ex用no比的話,就不會出現相同的no) 需要在Student類別內@override equals() ,
 *          如果是使用hashSet的話hashCode()也要override,
 * 
 *          }
 * @author SisolShie
 *
 */
public class Hw03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] names = { "William", "Lee", "Ethan", "Vera", "Reds", "Lee", "William", "Ethan" };

		Set<String> setUniqueName = new HashSet<>();
		for (String name : names) {
			setUniqueName.add(name);
		}
		System.out.println(setUniqueName);

		// Supplement -----------------------------
		Student s1 = new Student(1, "aaaa");
		Student s2 = new Student(2, "aabbb");
		Student s3 = new Student(3, "aaaaaa");
		Student s4 = new Student(4, "bbaaaab");
		Student s5 = new Student(5, "baaaa");

		List<Student> students = new ArrayList();
		students.add(s5);
		students.add(s4);
		students.add(s3);
		students.add(s1);
		students.add(s2);
		students.add(s3);

		Collections.sort(students);

		System.out.println(students);
		System.out.println();

	}

}
