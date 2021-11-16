package homework.bracechecker;

public class BraceCheckerTest {

    public static void main(String[] args) {

        String text = "h(e)llo (from) Jav[a";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
