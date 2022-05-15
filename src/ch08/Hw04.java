package ch08;

import java.util.Scanner;
import ch08.Nadder.NegativeIntegerException;

/**
 * <pre>
 * 4.以下程式會發生例外，請用 處理法則/宣告法則 加入適當的程式
 * public class Exercise09_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = Nadder.addToN(n);
        System.out.println("sum: " + sum);
        scanner.close();
    }
}

class Nadder {
		
    public static long addToN(int n) {

        // TODO 當n小於0時，拋出NegativeIntegerException例外

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
		
    static class NegativeIntegerException extends Exception {
        private static final long serialVersionUID = -5341944201608882872L;

        public NegativeIntegerException(String message) {
            super(message);
        }
    }
}
 * 
 * 
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Hw04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		try {
			long sum = Nadder.addToN(n);
			System.out.println("sum: " + sum);
			scanner.close();

		} catch (NegativeIntegerException e) {
			e.printStackTrace();
		}

	}
}

class Nadder {

	public static long addToN(int n) throws NegativeIntegerException {

		if (n < 0) {
			throw new NegativeIntegerException("輸入了不正確的數字 : " + n);
		}

		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	static class NegativeIntegerException extends Exception {
		private static final long serialVersionUID = -5341944201608882872L;

		public NegativeIntegerException(String message) {
			super(message);
		}
	}
}
