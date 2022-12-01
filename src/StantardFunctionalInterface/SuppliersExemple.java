package StantardFunctionalInterface;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SuppliersExemple {
    public static void main(String[] args) {
        /**
         * Prend pas de paramètres et renvoie une unique valeur
         */
        Supplier<String> stringSupplier = () -> "Hello";
        stringSupplier.get(); // the result is "Hello" (String)

        BooleanSupplier booleanSupplier = () -> true;
        booleanSupplier.getAsBoolean(); // the result is true (boolean)

        IntSupplier intSupplier = () -> 33;
        intSupplier.getAsInt(); // the result is 33 (int)
    }
}
