package StantardFunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorsExample {
    public static void main(String[] args) {
        /**
         * Prend une valeur et retourne la même valeur
         */
        // Long to Long multiplier
        UnaryOperator<Long> longMultiplier = val -> 100_000 * val;
        longMultiplier.apply(2L); // the result is 200_000L (Long)

// int to int operator
        IntUnaryOperator intMultiplier = val -> 100 * val;
        intMultiplier.applyAsInt(10); // the result is 1000 (int)

// (String, String) to String operator
        BinaryOperator<String> appender = (str1, str2) -> str1 + str2;
        appender.apply("str1", "str2"); // the result is "str1str2"
    }
}
