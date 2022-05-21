package FunctionComposition;

import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> adder = x -> x + 10;
        Function<Integer, Integer> multiplier = x -> x * 5;

// compose: adder(multiplier(5)) => avec compose on fait d'abord la multiplication puis l'addition
        System.out.println("result: " + adder.compose(multiplier).apply(5));

// andThen: multiplier(adder(5)) => avec andThen on fait d'abord l'addition puis la multiplication
        System.out.println("result: " + adder.andThen(multiplier).apply(5));

    }
}
