package chapter7;

public class RecTest {
    public static void main(String[] args) {
        Rec ob = new Rec(10);
        int i;

        for (int j = 0; j < 10; j++) ob.values[j] = j;
        ob.printArray(10);

    }
}
