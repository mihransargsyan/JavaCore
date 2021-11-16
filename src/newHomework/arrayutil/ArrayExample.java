package newHomework.arrayutil;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {55, 7, 9, 44, 10, 6, 55, 118, 400, 65};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // sortavorel masivy
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // stugel ete trvac tivy ka tpel ete voch tpel -1
        int value = 15;
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result = array[i];
            }
        }
        System.out.println(result);

        // tpel true ete masivi bolor elementnery zuyg en ete voch false
        boolean b = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                b = false;
                break;
            }
        }
        System.out.println(b);

        // tpel vor elementnern en krknvum
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " krknvum e");
                    break;
                }
            }
        }
    }
}
