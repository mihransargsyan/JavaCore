package Chapter3;

import javax.xml.bind.SchemaOutputResolver;

public class DebugExample {

    public static void main(String[] args) {

        int [] numbers = new int[5];
        numbers[0] = 31;
        numbers[1] = 34;
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);

        }
    }
}
