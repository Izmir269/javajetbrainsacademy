package FunctionComposition;

import java.util.function.IntPredicate;

public class PredicateComposition {
    public static void main(String[] args) {
        /**
         * Deux prédicats => isOdd et lessThan11
         */
        IntPredicate isOdd = n -> n % 2 != 0; // it's true for 1, 3, 5, 7, 9, 11 and so on

        System.out.println(isOdd.test(10)); // prints "false"
        System.out.println(isOdd.test(11)); // prints "true"

        IntPredicate lessThan11 = n -> n < 11; // it's true for all numbers < 11

        System.out.println(lessThan11.test(10)); // prints "true"
        System.out.println(lessThan11.test(11)); // prints "false"

        /**
         * negate() fait l'opposé du prédicat isOdd c'est à dire donc rend plutôt les nombres pairs
         */
        IntPredicate isEven = isOdd.negate(); // it's true for 0, 2, 4, 6, 8, 10 and so on
        System.out.println(isEven.test(10)); // prints "true"
        System.out.println(isEven.test(11)); // prints "false"
        /**
         * Combiner les deux prédicats avec or
         */
        IntPredicate isOddOrLessThan11 = isOdd.or(lessThan11);

        System.out.println(isOddOrLessThan11.test(10)); // prints "true"
        System.out.println(isOddOrLessThan11.test(11)); // prints "true"
        System.out.println(isOddOrLessThan11.test(12)); // prints "false"
        System.out.println(isOddOrLessThan11.test(13)); // prints "true"
        /**
         * Combiner les deux prédicats avec And
         */
        IntPredicate isOddAndLessThan11 = isOdd.and(lessThan11);

        System.out.println(isOddAndLessThan11.test(8));  // prints "false"
        System.out.println(isOddAndLessThan11.test(9));  // prints "true"
        System.out.println(isOddAndLessThan11.test(10)); // prints "false"
        System.out.println(isOddAndLessThan11.test(11)); // prints "false"
    }
}
