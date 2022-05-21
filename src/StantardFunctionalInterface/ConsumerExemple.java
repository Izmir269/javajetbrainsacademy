package StantardFunctionalInterface;


import java.util.function.Consumer;

public class ConsumerExemple {
    public static void main(String[] args) {
        /**
         * Accepte une valeur en entrée et ne retourne pas de valeur
         */
        // it prints a given string
        Consumer<String> printer = System.out::println;
        printer.accept("Consumer exemple"); // It prints "!!!"

    }
}
