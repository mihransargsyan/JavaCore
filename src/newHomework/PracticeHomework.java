package newHomework;

public class PracticeHomework {

    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int years) {
        return years * 365;
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        }
        return false;
    }

    boolean reverseBool(boolean value) {
        return !value;
    }

    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;
        }
        return array2.length;
    }
}
