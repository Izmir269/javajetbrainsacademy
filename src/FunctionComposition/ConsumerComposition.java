package FunctionComposition;

import java.util.function.Consumer;

public class ConsumerComposition {
    public static void main(String[] args) {
        /**
         * Afficher la valeur deux fois
         * In a real situation, you could use it to output a value to different destinations, like a database
         * or a logger.
         */
        Consumer<String> consumer = System.out::println;
        Consumer<String> doubleConsumer = consumer.andThen(System.out::println);
        doubleConsumer.accept("Hi!");
    }
}
