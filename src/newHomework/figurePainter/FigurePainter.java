package newHomework.figurePainter;

public class FigurePainter {

    public static void main(String[] args) {

        System.out.println(" 1 orinak ");
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" 2 orinak ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println(" 3 orinak ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println(" 4 orinak ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i + 5; j++) {
                System.out.print("  ");
            }
            for (int j = 6; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" 5 orinak ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
