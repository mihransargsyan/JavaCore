package newHomework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(1);
        da.add(11);
        da.add(15);
        da.add(20);


        System.out.println(da.getByIndex(1));

        da.print();

        da.delete(2);

        da.print();

        int[] numbers = {5, 50, 87, 9};

        da.add(numbers);

        da.print();

        da.add(88, 1);

        da.print();

        da.set(99, 0);

        da.print();

        System.out.println(da.isEmpty());

        System.out.println(da.isExists(20));

    }
}
