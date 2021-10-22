package Homework.Arrayutil;

public class Bolola {

    public static void main(String[] args) {

        System.out.println("1 օրինակ");

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int a = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == 'o') {
                a++;
            }
        }
        System.out.println(a);

        System.out.println("2 օրինակ");

        System.out.print(bolola[bolola.length / 2 - 1]);
        System.out.println(bolola[bolola.length / 2]);


        System.out.println("3 օրինակ");

        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println("true");
        } else
            System.out.println("false");


        System.out.println("4 օրինակ");

        char[] chars = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int j = 0; j < chars.length - 2; j++) {
            if (chars[j] != 'b') continue;
            else if (chars[j] == 'b')
                j += 2;
            if (chars[j] == 'b') {
                System.out.println(true);
                break;
            } else System.out.println(false);
        }

        System.out.println("5 օրինակ");

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' '};

        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') continue;
                System.out.print(text[i]);

        }
    }
}





