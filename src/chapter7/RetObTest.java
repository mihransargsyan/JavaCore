package chapter7;

public class RetObTest {

    public static void main(String[] args) {
        RetOb ob1 = new RetOb(2);
        RetOb ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob 1 = " + ob1.a);
        System.out.println("ob 2 = " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a =  " + ob2.a);
    }
}
