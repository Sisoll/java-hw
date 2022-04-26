package ch05;

import java.util.Arrays;

/**
 * 
 * @author SisolShie
 * 5.請宣告一個二維陣列，並用巢狀for迴圈將以下值放入陣列內
{
	{18, 27, 36, 45, 54, 63, 72, 81},
	{16, 24, 32, 40, 48, 56, 64},
	{14, 21, 28, 35, 42, 49},
	{12, 18, 24, 30, 36},
	{10, 15, 20, 25},
	{8, 12, 16},
	{6, 9},
	{4}
}
 *
 * java 萬般皆物件
 */

public class Hw05
{

	public static void main(String[] args)
	{
		//先設定第一層有幾個
		var d2 = new int[8][];

		//設定好巢狀矩陣的大小形狀,
		//這段不需要確認用
		for (int i = 0 , j = 8 ; i<d2.length ; i++ , j--)
		{
			d2[i] = new int [j];	
			//System.out.println(Arrays.toString(d2[i]));
		}
		
		//把第二層的資料放進去
		for (int i = 0 ; i < 8 ; i++ )
		{
			//	for (int j=7-i ; j>=0 ; j--)
				for (int j=0 ; i+j < 8 ; j++)
			{
				d2[i][j] = (9-i)  * ( j + 2) ; 
			}
			System.out.println(Arrays.toString(d2[i]));
		}
		
	}

}
