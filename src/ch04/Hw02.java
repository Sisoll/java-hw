package ch04;

/**
 * 
 * @author SisolShie 請用迴圈印出以下內容… 
 * 18 27 36 45 54 63 72 81 
 * 16 24 32 40 48 56 64 
 * 14 21 28 35 42 49 
 * 12 18 24 30 36 
 * 10 15 20 25 
 * 8 12 16 
 * 6 9 
 * 4
 */
public class Hw02
{
	public static void main(String[] args)
	{

		for (int i = 9; i >= 2; i--)
		{
			for (int j = 2; j <= i; j++)
			{
				System.out.print((i * j) + " ");
				if (i == j)
				{
					System.out.println();
				}
			}
		}

	}

}
