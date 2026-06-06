package FFF.Static;

public class TestD {

    static int a = 10 + demo();

    static {
        System.out.println(a);
        System.out.println("SB-1");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        demo();
        test(200);
        System.out.println("main end");
    }

    public static int demo() {
        System.out.println("demo start");
        System.out.println(a);
        System.out.println(b);
        System.out.println("demo end");
        return 40;
    }

    static int b = test(100);

    public static int test(int a) {
        System.out.println("test start");
        System.out.println(a);
        System.out.println(b);
        System.out.println("test end");
        return 2 * a;
    }

    static {
        System.out.println(b);
        System.out.println("SB-2");
    }
}

