package ch04;

import java.util.Scanner;

/**
 * 
 * @author SisolShie 1.請設計一程式，可讀入一正整數n，並印出1~n之內，3的倍數和4的倍數的總和
 *
 *         建立防呆 (如果亂輸入ex.0.5,-5), 將一開始的輸入先當成double s,然後強制轉型成int去判斷是否相等
 *
 */

public class Hw01 
{
	public static void main(String[] args) 
	{
		System.out.println("請輸入一個正整數");
		var scanner = new Scanner(System.in);
		var input_d = scanner.nextDouble(); // 這邊先把輸入當成小數型態
		scanner.close();

		// System.err.println( "hello");

		// 判斷輸入的是整數還是小數
		
		if (input_d == (int) input_d) {
			if (input_d > 0) {
				var sum = 0;
				for (var i = 1; i <= input_d; i++) {
					if ((i % 3 == 0 && i % 4 != 0) 
							|| (i % 3 != 0 && i % 4 == 0) 
							|| (i % 3 == 0 && i % 4 == 0)) {
						sum += i;
					}
				}
				System.out.println("在正整數 1 到 正整數 " + (int) input_d + " 之間 , 3的倍數和4的倍數的總和為 " + sum);
			} 
			else if (input_d == 0) {
				System.out.println("你輸入的數字為 0");
			} 
			else {
				System.out.println("你輸入的數字為負數");
			}
		} 
		else {
			System.out.println("你輸入的數字為小數");
		}

	}
}
