import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
//    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : Integer.MAX_VALUE; //либо так
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            return x / y;
        }
        catch (ArithmeticException e) {
           throw new IllegalArgumentException("Argument 'divisor' is 0");  //либо так
        }
    };
}