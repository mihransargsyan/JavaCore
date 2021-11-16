package newHomework.figurePainter;

public class FigurePaint {

    void figure1(int n, char c) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figure2(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }

    void figure3(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(c + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    void figure4(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + n; j++) {
                System.out.print("  ");
            }
            for (int j = n + 1; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figure5(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
