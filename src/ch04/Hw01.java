package ch04;

import java.util.Scanner;

/**
 * 
 * @author SisolShie 1.請設計一程式，可讀入一正整數n，並印出1~n之內，3的倍數和4的倍數的總和
 *
 *
 *         防呆,變數首字母小寫 重構 junit 單元測試(針對class) (自動化) Kent Back
 * 
 * 
 */

public class Hw01
{

	public static void main(String[] args)
	{
		System.out.println("請輸入一個正整數");
		var scanner = new Scanner(System.in);
		int numInput = scanner.nextInt();
		scanner.close();

		int sum0 = 0;
		for (int i = 1; i <= numInput; i++)
		{
			if ((i % 3 == 0 && i % 4 != 0) 
					|| (i % 3 != 0 && i % 4 == 0) 
					|| (i % 3 == 0 && i % 4 == 0))
			{
				sum0 = sum0 + i;
			}
		}

		/*
		 * 另外一種比較沒效率的寫法 int sum3 = 0; int sum4 = 0; int sum12 = 0;
		 * 
		 * String all3 = ""; String all4 = "";
		 * 
		 * 
		 * for (int i=0 ; i<= numInput ; i++) { if (i%3!=0) { continue; } sum3 = sum3+i;
		 * all3 = all3 + i + " "; }
		 * 
		 * for (int i=0 ; i<= numInput ; i++) { if (i%4!=0) { continue; } sum4 = sum4+i;
		 * all4 = all4 + i + " ";
		 * 
		 * }
		 * 
		 * for (int i=0 ; i<= numInput ; i++) { if (i%12==0) { sum12 = sum12+i; } }
		 * 
		 * int sum = sum3 + sum4 - sum12; //減去3和4的公倍數
		 * 
		 * 
		 * System.out.println("3的倍數有" + all3); System.out.println("4的倍數有" + all4);
		 * 
		 * System.out.println("在 1 到 " + numInput +" 之間 , 3的倍數和4的倍數的總和為 " + sum);
		 * 
		 */
		System.out.println("在 1 到 " + numInput + " 之間 , 3的倍數和4的倍數的總和為 " + sum0);
	}
}
