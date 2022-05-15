package ch08;

import java.io.FileNotFoundException;

/**
 * 
 * <pre>
 * 以下程式會發生例外，請用 處理法則/宣告法則 加入適當的程式

public class Exercise09_3 {

    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        throw new FileNotFoundException("throw from m2()");
    }
}
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class Hw03 {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		try {
			m2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void m2() throws FileNotFoundException {
		throw new FileNotFoundException("throw from m2()");
	}
}
