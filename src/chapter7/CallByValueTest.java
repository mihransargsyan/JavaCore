package chapter7;

public class CallByValueTest {

    public static void main(String[] args) {
        CallByValue ob = new CallByValue();

        int a = 15, b = 20;
        System.out.println("a ib do vizova: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a ib posle vizova: " + a + " " + b);
    }
}
