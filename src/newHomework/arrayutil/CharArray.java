package newHomework.arrayutil;

public class CharArray {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;

        System.out.println("1 orinak ");
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                count++;
            }
        }
        System.out.println("count of o = " + count);

        System.out.println("2 orinak ");
        System.out.println(bolola[bolola.length / 2 - 1] + " " + bolola[bolola.length / 2]);

        System.out.println("3 orinak ");
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println(true);
        } else System.out.println(false);

        System.out.println("4 orinak ");
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean b = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                b = true;
                break;
            }
        }
        System.out.println(b);

        System.out.println("5 orinak ");
        char[] text = {' ', ' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ', ' '};
        int startIndex = 0;
        int endIndex = text.length - 1;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                startIndex = i;
                break;
            }
        }
        for (int i = text.length - 1; i > startIndex; i--) {
            if (text[i] != ' ') {
                endIndex = i;
                break;
            }
        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i < endIndex + 1; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
