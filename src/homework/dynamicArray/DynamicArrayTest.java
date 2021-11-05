package homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);
        da.add(10);
        da.add(11);
        da.add(12);
        da.add(13);
        da.add(14);
        da.add(15);

        int byIndex = da.getByIndex(15);
        System.out.println(byIndex);

        da.print();

    }
}
