package homework;

public class PracticeHomework {

    long convert(int minutes) {
        long seconds = minutes * 60;
        return seconds;
    }

    int calcAge(int years) {
        int days = years * 365;
        return days;
    }

    int nextNumber(int number) {
        int nextNum = number + 1;
        return nextNum;
    }

    boolean result = false;

    boolean isSameNum(int a, int b) {
        if (a == b) {
            result = true;
        }
        return result;
    }

    boolean x = false;

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            x = true;
        }
        return x;
    }

    boolean reverseBool(boolean value) {
        return !value;
    }

    int length;

    int maxLength(int[] array1, int[] array2) {
        if (array1.length >= array2.length) {
            length = array1.length;
        } else
            length = array2.length;
        return length;
    }
}
