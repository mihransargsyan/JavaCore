package newHomework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {55, 7, 9, 44, 10, 6, 57, 118, 400, 65};

        System.out.println("1 orinak  masivi bolor elementnety");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("2 orinak  masivi amenamec tivy");
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        System.out.println("3 orinak  masivi amenapoqr tivy");
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);

        System.out.println("4 orinak  tpel masivi zuyg elementnery");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.println("5 orinak  tpel masivi kent elementnery");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.println("6 orinak  tpel masivi zuygeri qanaky");
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);

        System.out.println("7 orinak  tpel masivi kenteri qanaky");
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);

        System.out.println("9 orinak  tpel masivi elementneri gumary");
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);

        System.out.println("8 orinak  tpel masivi elementneri mijin tvabanakany");
        System.out.println("avg = " + sum / array.length);
    }
}
