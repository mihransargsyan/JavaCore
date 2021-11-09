package chapter7;

public class OverLoadDemo {

    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        double result;
        int i = 88;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        ob.test(i);
        result = ob.test(123.25);
        System.out.println("ob.test(123.25): " + result);
    }
}
