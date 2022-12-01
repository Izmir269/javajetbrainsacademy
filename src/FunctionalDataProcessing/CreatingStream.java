package FunctionalDataProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        // Plusieurs moyens de créer un stream en utilisant une liste, set,un array, un string...etc comme source

        // Option 1 : Créer à partir d'une collection. Toutes les collections ont la méthode stream()
        List<Integer> famousNumbers = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        Stream<Integer> numbersStream = famousNumbers.stream();

        Set<String> usefulConcepts = Set.of("functions", "lazy", "immutability");
        Stream<String> conceptsStream = usefulConcepts.stream();

        // Option 2 : obtenir un stream à partir d'un tableau
        Stream<Double> doubleStream = Arrays.stream(new Double[]{ 1.01, 1d, 0.99, 1.02, 1d, 0.99 });

        // Option 3 : directement de valeurs en dur
        Stream<String> persons = Stream.of("John", "Demetra", "Cleopatra");

        // Option 4 : concaténer des streams ensemble
        Stream<String> stream1 = Stream.of(/* some values */);
        Stream<String> stream2 = Stream.of(/* some values */);
        Stream<String> resultStream = Stream.concat(stream1, stream2);

        // Option 5 : On peut créer des streams vides qui peuvent servir de retour à certaines méthodes
        Stream<Integer> empty1 = Stream.of();
        Stream<Integer> empty2 = Stream.empty();
    }
}
