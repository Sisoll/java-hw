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
		var scanner = new Scanner(System.in);
		var numInput = scanner.nextInt();
		scanner.close();
		
		if (numInput == 1)
		{
			System.out.println("所輸入的數字為 1 , 1 到 1 之間並沒有任何質數"); 
		}
		else if (numInput == 2)  
		{
			System.out.println("在 1 到 2 之間的質數和 , 如果不包括首尾的話 ,其值為0"); 
		}	
		else if (numInput >=3)
		{
			var sum = 0;
			var prime = "" ; 
			
			for ( var i = (numInput -1) ; i >= 2 ; i--)
			{
				var isPrime = true ;
			//	System.out.println("  i " ); 
				for (var j = 2 ; j < (i -1 ) ; j++)
				{	
					if ( i % j ==0)
					{
						isPrime = false ;
						break;
					}
					
				}
				if (isPrime)
				{
					prime = i + " " + prime;
					sum += i;
				}
			}	
			System.out.println("在 1 到 " + numInput + " 之間的質數有: " + prime); 
			System.out.println("在 1 到 " + numInput + " 之間的質數和: " + sum); 
		}	
	}
}	