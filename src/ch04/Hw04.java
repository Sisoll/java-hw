package ch04;

import java.util.Scanner;

/**
 * 
 * @author SisolShie
 * 4.請設計一程式，可讀入一個正整數n，並印出1~n所有質數的總和
 *
 */


public class Hw04
{
	public static void main(String[] args)
	{
		System.out.println("請輸入一個正整數");
		Scanner Obj = new Scanner(System.in);
		int numInput = Obj.nextInt();
		Obj.close();
		
		boolean isPrime = true ;
		
		//// 如果輸入的是2,因為在條件式中已經不合條件(2< (2+1)/2),自動跳出迴圈,所以會維持布林的true,也就是質數
		for (int i = 2 ; i < (numInput+1)/2 ; i++)   
		{
			if (numInput % i == 0)
			{
				isPrime = false;
			}	
		}
		
		if (isPrime)
		{
			System.out.println(numInput + " 是質數");
		}
		else if (numInput ==1) 
		{
			System.out.println(numInput + " 不是質數");
		}
		else 
		{
			System.out.println(numInput + " 不是質數");
		}
	}	
}
