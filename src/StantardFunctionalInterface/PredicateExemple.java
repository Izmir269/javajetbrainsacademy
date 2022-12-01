package StantardFunctionalInterface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExemple {
    public static void main(String[] args) {
        /**
         * Prend un type en entrée et renvoie un booléen
         */
        // Character to boolean predicate
        Predicate<Character> isDigit = Character::isDigit;
        boolean x = isDigit.test('h'); // the result is false (boolean)
        System.out.println(x);

        // int to boolean predicate
        IntPredicate isEven = val -> val % 2 == 0;
        isEven.test(10); // the result is true (boolean)
    }
}
