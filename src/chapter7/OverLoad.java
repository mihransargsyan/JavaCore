package chapter7;

public class OverLoad {

    void test() {
        System.out.println("datark e");
    }

    void test(int a) {
        System.out.println("a = " + a);
    }

    void test(int a, int b) {
        System.out.println("a i b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
