package Homework;

public class FigurePainter {

    public static void main(String[] args) {
        // Առաջին օրինակը
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        // Երկրորդ օրինակը
        System.out.println(); // իրարից առանձնացնելու համար
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("  ");

            }
            for (int k = 4 - i; k < 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Երրորդ օրինակը
        System.out.println(); // իրարից առանձնացնելու համար

        for (int i = 0; i < 5; i++) {

            for (int j = i; j < 4; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}