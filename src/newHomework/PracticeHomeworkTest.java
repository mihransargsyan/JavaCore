package newHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {

        PracticeHomework ph = new PracticeHomework();

        System.out.println(ph.convert(10));

        System.out.println(ph.calcAge(10));

        System.out.println(ph.nextNumber(10));

        System.out.println(ph.isSameNum(10, 11));

        System.out.println(ph.lessThanOrEqualToZero(10));

        System.out.println(ph.reverseBool(true));

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        System.out.println(ph.maxLength(array1, array2));
    }
}
