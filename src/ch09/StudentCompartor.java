package ch09;

import java.util.Comparator;

/**
 * <pre>
 * 請定義類別StudentComparator，實作Comparator<Student>介面，
 * 讓第4題的Student物件可以依no遞減排序
 * </pre>
 * 
 * @author SisolShie
 */
public class StudentCompartor implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return  - (o1.getNo() - o2.getNo());
	}

}
