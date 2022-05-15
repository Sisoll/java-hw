package ch08;

public class Exercise09_5 {
    static {
        System.out.println("A");
    }

    public Exercise09_5() {
        System.out.println("B");
    }

    public void m1() {
        try {
            System.out.println("C");
            m2();
        } catch (Exception e) {
            System.out.println("D");
        } finally {
            System.out.println("E");
        }
    }

    public void m2() throws Exception {
        try {
            System.out.println("F");
            m3();
        } catch (RuntimeException e) {
            System.out.println("G");
        } finally {
            System.out.println("H");
        }
    }

    public void m3() throws Exception {
        System.out.println("I");
        if (true) {
            throw new Exception();
        }
        System.out.println("J");
    }

    static {
        System.out.println("K");
    }

    public static void main(String[] args) {
        System.out.println("L");
        new Exercise09_5().m1();
        System.out.println("M");
    }
}