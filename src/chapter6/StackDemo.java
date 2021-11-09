package chapter6;

public class StackDemo {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(34);
        stack.push(44);
        stack.push(54);

        stack.pop();
        System.out.println(stack.pop());
        stack.push(64);
        System.out.println(stack.pop());

        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++)mystack1.push(i);
        for (int i = 10; i < 20; i++)mystack2.push(i);

        System.out.println(" mystack 1");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println(" mystack 2");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());


    }
}
