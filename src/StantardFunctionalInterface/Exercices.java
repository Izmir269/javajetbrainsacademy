package StantardFunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Exercices {
    public static void main(String[] args) {

    }

    /**
     *
     * @param condition
     * @param ifTrue
     * @param ifFalse
     * @param <T>
     * @param <U>
     * @return
     */
    public static <T, U> Function<T, U> ternary(Predicate<? super T> condition,
                                                Function<? super T, ? extends U> ifTrue,
                                                Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}
