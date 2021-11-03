package calc;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result = calc.plus(10, 5);
        System.out.println(result);

        result = calc.minus(10,5);
        System.out.println(result);

        double d = calc.divide(10,5);
        System.out.println(d);

        long l = calc.multiple(10,5);
        System.out.println(l);

    }
}
