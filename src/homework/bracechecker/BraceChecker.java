package homework.bracechecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String a) {
        text = a;
    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    char chars = stack.pop();
                    if (chars != '(') {
                        System.err.println("Error: opened " + chars + " but closed " + c + " at " + i);
                    }
                    break;
                case '}':
                    char chars1 = stack.pop();
                    if (chars1 != '{') {
                        System.err.println("Error: opened " + chars1 + " but closed " + c + " at " + i);
                    }
                    break;
                case ']':
                    char chars2 = stack.pop();
                    if (chars2 != '[') {
                        System.err.println("Error: opened " + chars2 + " but closed " + c + " at " + i);
                    }
                    break;
            }
        }
    }
}
