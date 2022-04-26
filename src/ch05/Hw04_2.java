package ch05;

import java.util.Arrays;

/**
 * 
 * @author SisolShie 4.有一字串陣列內容如下… String[] mySkills = {"java", "javascript",
 *         "sql", "c", "python", "php", "swift"}; 請統計並印出陣列內每個字母各有幾個，EX…a:4 c:2
 */

public class Hw04_2
{

	public static void main(String[] args)
	{
		String[] mySkills = { "java", "javascript", "sql", "c", "python", "php", "swift" };
		System.out.println(Arrays.toString(mySkills));

		// 把全部合起來
		String allin1 = "";
		for (String i : mySkills)
		{
			allin1 = allin1 + i;
		}

		// 把allin1轉成陣列
		char[] array1 = allin1.toCharArray();

		//針對a~z去搜尋有幾個
		for (int n = 97; n <= 122; n++)
		{
			int sum = 0;
			
			for (int i = 0; i < array1.length; i++)
			{
				if (array1[i] != (char) n)
				{
					continue;
				}
				
				sum++;
			}
			
			if (sum != 0)  //只印出有的
			{
				System.out.println((char) n + " : " + sum);
			}
		}

	}
}
