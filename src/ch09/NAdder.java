package ch09;

/**
 * <pre>
 * 1.請定義類別NAdder，有1個靜態方法addToN()
 * 參數: n
 * 回傳: 1加到n的總和
 * 請將此方法定義成 泛型方法，可在呼叫時再決定參數的型態
 * 
 * 2.續第1題，addToN()的參數只能傳入Number的子類別，請加入適當的程式限制
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class NAdder {

	// hw1:
	public static <T> long addToN(T n) {
		if (!(n instanceof Number)) {
			return 0;
		}

		long sum = 0;
		for (var i = 1; i <= ((Number) n).longValue(); i++) {
			sum += i;
		}
		return sum;
	}

	// hw2:
//	public static <T extends Number> long addToN(T n) {
//		long sum = 0;
//		for (var i = 1; i <= n.longValue(); i++) {
//			sum += i;
//		}
//		return sum;
//	}

	public static void main(String[] args) {

		System.out.println(addToN(2.5));
		System.out.println(addToN("2.5"));
		System.out.println(addToN(1000));
	}
}
