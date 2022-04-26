package ch04;
import java.util.Scanner;

/**
 * 
 * @author SisolShie 5.請設計一程式，可讀入兩個正整數，表示year: 年、month: 月，印出該年該月有幾天
 *
 */

public class Hw05
{
	public static void main(String[] args)
	{
		Scanner Obj = new Scanner(System.in);
		System.out.println("請輸入年份(西元)");
		int year = Obj.nextInt();
		System.out.println("請輸入月份");
		int month = Obj.nextInt();
		Obj.close();

		// 計算是否為閏年
		boolean isLeapYear;

		if (year % 4 != 0)
		{
			isLeapYear = false;
		} 
		else if (year % 100 == 0 && year % 400 != 0)
		{
			isLeapYear = false;
		} 
		else
		{
			isLeapYear = true;
		}

		// 設定每個月的天數
		int day;
		switch (month)
		{
		case 1:
			day = 31;
			break;
		case 2:
			if (isLeapYear)
			{
				day = 29;
			} 
			else
			{
				day = 28;
			}
			break;
		case 3:
			day = 31;
			break;
		case 4:
			day = 30;
			break;
		case 5:
			day = 31;
			break;
		case 6:
			day = 30;
			break;
		case 7:
			day = 31;
			break;
		case 8:
			day = 31;
			break;
		case 9:
			day = 30;
			break;
		case 10:
			day = 31;
			break;
		case 11:
			day = 30;
			break;
		case 12:
			day = 31;
			break;
		default:
			day = -1;
			break;
		}

		if (day != -1)
		{
			System.out.println("西元" + year + "年 " + month + "月有 " + day + "天");
		} 
		else
		{
			System.out.println("月份輸入錯誤");
		}
	}
}
