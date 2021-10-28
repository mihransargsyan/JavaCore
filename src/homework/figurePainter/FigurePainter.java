package homework.figurePainter;

public class FigurePainter {

    void figureOne(int n, char c) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureTwo(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureThree(int n, char c) {

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }

    void figureFour(char c) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 4; j++) {
                System.out.print("  ");
            }
            for (int k = 4; k > i; k--) {
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }

    void figureFive(int n, char c) {

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n - 1; j > i; j--) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
