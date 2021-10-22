package Homework;

public class ArrayExample {

    public static void main(String[] args) {

        int[] array = {10, 3, 87, 95, 11, 54, 8, 45, 64, 12};

//        int n = 54;
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == n) {
//                index = i;
//            }
//        }
//        System.out.println(index);

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
    }
}





