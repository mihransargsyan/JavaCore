package homework;

public class FigurePainter {

    public static void main(String[] args) {

        System.out.println(" 1 orinak ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" 2 orinak ");

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" 3 orinak ");

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println(" 4 orinak ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 4; j++) {
                System.out.print("  ");
            }
            for (int k = 4; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" 5 orinak  ");

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}