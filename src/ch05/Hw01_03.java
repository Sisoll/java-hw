package ch05;
import java.util.Arrays;

/**
 * 
 * @author SisolShie 
 * 1.請宣告一個元素型態為int的陣列，其陣列大小為10，並利用Math.random()隨機指定0~100的值給每個元素，且每個值不可重複
 * 2.(續上題) 請印出陣列所有元素的總和、平均值
 * 3.(續上題) 請將陣列排序，若有陣列元素之值等於平均值，印出該元素的索引
 * 否則，找出平均值介於哪兩個元素值之間，印出該兩個元素的索引
 *
 */

public class Hw01_03
{

	public static void main(String[] args)
	{
		// HW1
		int numarray [] = new int [10];
		
		for (int i = 0 ; i < numarray.length ; i++)
		{
			numarray[i] = (int)((Math.random()*99+1)) ; 			
			//System.out.println("第" + i + "個位置  第一次產生的陣列內容:"+numarray[i]);
			
			back:			
			for (int j=0 ; j < i ; j++)
			{
				//System.out.println("現在新的數字是" + numarray[i] + "   要比較的之前數字有 "+numarray[j]);
				while (numarray[j] == numarray[i])
				{
					numarray[i] = (int)((Math.random()*99+1));
					//System.out.println ("第" + i +"個位置   新陣列內容" + numarray[i]);
					j = -1 ; //很重要,若是不重新給初始值,continue之後,j會繼續往下跑,接著去比較i後面的數字
					continue back;	
				}
				
			}
		}

		System.out.print ( "陣列為 : ");
		for (int i : numarray)
		{
			System.out.print (i + " " );
		}
		System.out.println ( " ");

		
		// HW2
		int sum = 0;
		for (int i=0 ; i<numarray.length ; i++)
		{
			sum = sum +  numarray[i];
		}

		double avg = (double)sum / (double)numarray.length;
		
		System.out.println("陣列內數值的總和為: " + sum + "; 其平均數為: " + avg);

		
		//HW3
		
		Arrays.sort(numarray);  //由小到大排序
		System.out.println("排序後的陣列為: " + Arrays.toString(numarray));
		
		for (int i=0 ; i<numarray.length ; i++)
		{
			if ( (double)numarray[i] == avg)
			{
				System.out.println("陣列中索引 " + i + " 位置的值和平均數 " + (int)avg + " 相同" );
				break;
			}
			else if (numarray[i]>avg)
			{
				int minmaxI = i ;
				int maxminI = i - 1 ; 
				System.out.println("陣列述職的平均數 " + avg + " 位於索引為 " + maxminI + " 以及 " + minmaxI + " 之間");
				break;
			}
		}
	}

}
