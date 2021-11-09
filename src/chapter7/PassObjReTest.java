package chapter7;

public class PassObjReTest {

    public static void main(String[] args) {
        PassObjRe ob = new PassObjRe(15, 20);
        System.out.println("Do vizova: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("Posle vizova: " + ob.a + " " + ob.b);
    }
}
