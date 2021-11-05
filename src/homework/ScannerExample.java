package homework;

import calc.Calculator;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a");
        int a = scanner.nextInt();
        System.out.println("pleaze input b");
        int b = scanner.nextInt();
        //  System.out.println("sum = " + (a+b));

        System.out.println("please input operation (+,-,/,*)");
        String operation = scanner.next();
        Calculator calculator = new Calculator();

        switch (operation) {
            case "+":
                System.out.println(calculator.plus(a, b));
                break;
            case "-":
                System.out.println(calculator.minus(a, b));
                break;
            case "/":
                System.out.println(calculator.divide(a, b));
                break;
            case "*":
                System.out.println(calculator.multiple(a, b));
                break;
            default:
                System.out.println("invalid operation");

        }

        //  System.out.println(operation);

        // ստեղծել Calculator կլասի օբեկտը
        // ստանալ operation-ը (+,-,/,*)
        // ստուգել թե որ operation-նն է ներմուծված
        // կանչել Calculator-ի համապատասխան օբյեկտը


    }
}
