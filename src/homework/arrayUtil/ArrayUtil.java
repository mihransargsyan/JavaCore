package homework.arrayUtil;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {71, 4, 7, 10, 138, 16, 175, 3, 54, 12};


        System.out.println(" 1 օրինակ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println(" 2 օրինակ ");

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        System.out.println(" 3 օրինակ ");

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);

        System.out.println(" 4 օրինակ ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.println(" 5 օրինակ ");

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();

        System.out.println(" 6 օրինակ ");

        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("count of even: " + evenCount);

        System.out.println(" 7 օրինակ ");

        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("odd of count: " + oddCount);

        System.out.println(" 8,9 օրինակ ");

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("avg: " + sum / array.length);
        System.out.println("sum: " + sum);

    }

}



