package homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

//        da.add(1);
//        da.add(2);
//        da.add(3);
//        da.add(4);
//        da.add(5);
//        da.add(6);
//        da.add(7);
//        da.add(8);
//        da.add(9);
//        da.add(10);

//        int byIndex = da.getByIndex(16);
//        System.out.println(byIndex);

//        da.print();
//
//        da.delete(4);
//
//        da.print();

        da.add(5);

        int[] numbers = {33, 44, 55};

        da.add(numbers);

        da.print();

        da.add(10, 2);

        da.print();

        da.set(77, 2);

        da.print();

        System.out.println(da.isEmpty());
        System.out.println(da.isExists(77));


    }
}
