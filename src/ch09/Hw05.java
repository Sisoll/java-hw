package ch09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * 5.請宣告一List物件..
 * List<Student> list1 = new ArrayList<>();
 * 
 * 將第3題集合物件的元素，一一轉成第4題的Student型態，並加入至list1物件中
 * 註: no(學號)規則: 從1開始，依序編號
 * 
 * 6.請宣告一List物件..
 * List<Map<String, Object>> list2 = new ArrayList<>();
 * 
 * 將第5題list1的元素，一一轉成Map<String, Object>型態，並加入至list2物件中
 * 註: Map的鍵 就是 Student類別的 性質名
 * 
 *  Map.of  
 *	List.of
	Set.of
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Hw05 {

	public static void main(String[] args) {

		/*
		 * Hw03內容 String[] names = { "William", "Lee", "Ethan", "Vera", "Reds", "Lee",
		 * "William", "Ethan" };
		 * 
		 * Set<String> setUniqueName = new HashSet<>(); for (String name : names) {
		 * setUniqueName.add(name); }
		 */

		Student s1 = new Student(1, "William");
		Student s2 = new Student(2, "Lee");
		Student s3 = new Student(3, "Ethan");
		Student s4 = new Student(4, "Vera");
		Student s5 = new Student(5, "Reds");

		List<Student> list1 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);

		// for (Student value : list1) {
		// System.out.println("id :" + value.getNo() +" name :" + value.getName());}

		List<Map<String, Object>> list2 = new ArrayList<>();		
		
		Map<String, Object> map1 = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map<String, Object> map3 = new HashMap<>();
		Map<String, Object> map4 = new HashMap<>();
		Map<String, Object> map5 = new HashMap<>();
		
		map1.put(s1.getName(), s1);
		map2.put(s2.getName(), s2);
		map3.put(s3.getName(), s3);
		map4.put(s4.getName(), s4);
		map5.put(s5.getName(), s5);

		//list2.add(Map.of("1",s1));
	//	list2.add(Map.of("2",s2));
		//list2.add(Map.of("3",s3));
		
		list2.add(map1);
		list2.add(map2);
		list2.add(map3);
		list2.add(map4);
		list2.add(map5);
		
		System.out.println(list2);
		
		System.out.println(list2.get(0));
		
//		for (String key : map.keySet()) {
//			System.out.println(key + ": " + map.get(key));
//		}
//		System.out.println("-----------------------------");

//		Set<Map.Entry<String, Object>> entries = map.entrySet();
//		
//		for (Map.Entry<String, Object> ent : entries)
//		{
//			System.out.println(ent.getKey() + "   "+ ent.getKey().getClass());
//			System.out.println(ent.getValue() + "   " + ent.getValue().getClass());			
//		}
	
	}

}
