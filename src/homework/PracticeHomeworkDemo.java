package homework;

public class PracticeHomeworkDemo {

    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();

        long seconds = practiceHomework.convert(50);
        System.out.println("seconds = " + seconds);

        int days = practiceHomework.calcAge(5);
        System.out.println("days = " + days);

        int nextNumber = practiceHomework.nextNumber(58);
        System.out.println("Next Number = " + nextNumber);

        boolean isSameNun = practiceHomework.isSameNum(6, 8);
        System.out.println(isSameNun);

        boolean lessThanOrEqualToZero = practiceHomework.lessThanOrEqualToZero(0);
        System.out.println(lessThanOrEqualToZero);

        boolean reverseBool = practiceHomework.reverseBool(false);
        System.out.println(reverseBool);

        int [] array1 = {1,9,69,85,74,85};
        int [] array2 = {1,5,74,85,57,96,847,2};
        int maxLength = practiceHomework.maxLength(array1,array2);
        System.out.println(maxLength);
    }
}
