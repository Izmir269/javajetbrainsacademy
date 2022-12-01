package StantardFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionsExample {
    public static void main(String[] args) {
        /**
         * Function<T, R> qui accepte une valeur de type T et renvoie une valeur de type R
         */
        // String to Integer function
        Function<String, Integer> converter = Integer::parseInt;
        converter.apply("1000"); // the result is 1000 (Integer)

// String to int function
        ToIntFunction<String> anotherConverter = Integer::parseInt;
        anotherConverter.applyAsInt("2000"); // the result is 2000 (int)

// (Integer, Integer) to Integer function
        BiFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a + b;
        sumFunction.apply(2, 3); // it returns 5 (Integer)
    }
}
