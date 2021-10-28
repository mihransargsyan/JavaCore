package homework.arrayUtil;

public class ArrayUtil1Test {

    public static void main(String[] args) {

        ArrayUtil1 arrayUtil1 = new ArrayUtil1();

        int[] array = {2, 6, 87, 95, 4, 8, 3, 54, 17, 28, 9};
        int[] array2 = {205, 6, 87, 95, 48, 8, 3, 54, 17, 28, 9};

//        arrayUtil1.max(array);
//        arrayUtil1.max(array2);
        int arrayMax = arrayUtil1.max(array);
        int arrayMax2 = arrayUtil1.max(array2);
        if(arrayMax>arrayMax2){
            System.out.println("mec tiv@ arrayi mej e " + arrayMax);
        }else
            System.out.println("mec tivy array2 i mej e " + arrayMax2);
        arrayUtil1.print(array);
        arrayUtil1.print(array2);
    }
}
