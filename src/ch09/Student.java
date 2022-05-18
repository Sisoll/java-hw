package ch09;

import java.util.Comparator;
import java.util.Objects;

/**
 * <pre>
 * 4.請定義Student類別..
 * 欄位: no(學號)、name
 * 建構子: 無參數建構子、2個參數建構子(no、name)
 * 方法: 欄位的Setter/Getter
 * 
 * 7.替第4題的Student類別實作Comparable介面，
 * 讓Student物件可以依name第一個字元的Unicode編碼遞增排序
 * 
 * 
 * 9.
 * </pre>
 * 
 * {
 * 
 * @summary hashCode / equals / toString 皆可以用 alt+shift+s 產生 }
 * 
 * @author SisolShie
 *
 */
public class Student implements Comparable<Student>, Comparator<Student>{

	// // hw4:

	private int no;
	private String name;
	private Subject subject;
	private int chi;
	private int eng;
	private int math;

	public Student() {
	}

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public Student(int no, String name, int chi, int eng, int math) {
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
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

	// <<supplement>>

	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}

//	// hw7:
	@Override
	public int compareTo(Student o) {
		// return this.no - o.no;
		 return this.name.charAt(0) - o.name.charAt(0);

		// <<supplement>>
/*		int thisLength = this.name.length();
		int oLength = o.name.length();
		int samller;

		if (thisLength - oLength < 0) {
			samller = thisLength;
		} else {
			samller = oLength;
		}

		for (var i = 0; i < samller; i++) {
			if (this.name.charAt(i) - o.name.charAt(i) == 0) {
				if (i == samller - 1) {
					if (thisLength == oLength) {
						return 0;
					} else if (thisLength < oLength) {
						return -1;

					} else {
						return 1;
					}

				} else {
					continue;
				}

			} else {
				return this.name.charAt(i) - o.name.charAt(i);
			}
		}
		return 0;*/
	}

	
	@Override
	public String toString() {
		return "  Student [no=" + no + ", name=" + name + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		int totalo1 = o1.getChi() + o1.getEng() + o1.getMath();
		int totalo2 = o2.getChi() + o2.getEng() + o2.getMath();
		return -(totalo1 - totalo2);
	}
	
	
}
