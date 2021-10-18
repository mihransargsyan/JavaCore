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

        for (int i = bolola.length / 2 - 1; i < bolola.length / 2 + 1; i++) {
            System.out.println(bolola[i]);
        }

        System.out.println("3 օրինակ");

        for (int i = bolola.length - 2; i < bolola.length; i++) {
            if (bolola[i] == 'l') {
                i++;
                if (bolola[i] == 'y') {
                    System.out.println("true");
                } else
                    System.out.println("false");
            }
        }

        System.out.println("4 օրինակ");

        char[] chars = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != 'b') continue;
            else if (chars[i] == 'b')
                i += 2;
            if (chars[i] == 'b') {
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





