package homework.arrayUtil;

public class CharArray {

    public static void main(String[] args) {
//        //     ինդեքս        0    1    2    3    4    5
//        char[] charArray = {'b', 'o', 'l', 'o', 'l', 'a'};
//        // առաջին էլեմենտ
//        System.out.println(charArray[0]);
//        // վերջին էլեմենտ
//        System.out.println(charArray[charArray.length - 1]);
//        // նախավերջին էլեմենտ
//        System.out.println(charArray[charArray.length - 2]);
//        // մեջտեղի էլեմենտ
//        System.out.println(charArray[charArray.length / 2]);
//        int count = 0;
//        char c = 'o';
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] == c) {
//                count++;
//            }
//        }
//        System.out.println("count of ' " + c + "'= " + count);
//
//        System.out.println(charArray[charArray.length / 2 - 1]);
//        System.out.println(charArray[charArray.length / 2]);
//
//        if (charArray[charArray.length - 2] == 'l' &&
//                charArray[charArray.length - 1] == 'y') {
//            System.out.println(true);
//        }else
//            System.out.println(false);

//        char[] charArray = {'b', 'o', 'l', 'o', 'l', 'a'};
//        boolean isBob = false;
//        for (int i = 0; i < charArray.length - 2; i++) {
//            if (charArray[i] == 'b' && charArray[i + 2] == 'b') {
//                isBob = true;
//                break;
//            }
//        }
//        System.out.println(isBob);

        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' ', ' '};

        int startIndex = 0;
        int endIndex = text.length - 1;

        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        while (startIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - startIndex) + 1];

        int index = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }


    }
}
