package Chapter3;

public class Example2 {

    public static void main(String[] args) {

        int a = 5;
        int a2 = a;
        System.out.print("a=");
        System.out.println(a);
        System.out.println("a=" + a);
        System.out.println("5" + a);
        System.out.println(a + a);
        a = a * 2;
        System.out.println("a=" + a);
        System.out.println("a2=" + a2);

        if (a >= a2) {
            System.out.println("a մեծ կամ հավասար է a2");
        } else {
            System.out.println("a փոքր է a2-ից");
        }
        int x, y;

        x = 10;
        y = 20;
        if (x < y) System.out.println("x-ը փոքր է -yից");
        x = x * 2;
        if (x == y) System.out.println("x-ը = y");
        x = x * 2;
        if (x > y) System.out.println("x-ը մեծ է -yից");
    }
}
