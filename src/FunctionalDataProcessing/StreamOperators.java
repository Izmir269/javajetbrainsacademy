package FunctionalDataProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperators {
    public static void main(String[] args) {
        List<Integer> famousNumbers = List.of(0, 1,55, 37, 1, 2, 3, 5, 8, 13, 21, 34);
        List<String> fruits = List.of("Banane", "Mangue", "Kiwi", "Banane");

        // filter + count
        long count = famousNumbers.stream()
                .filter(num -> num > 5) // opérateur intermédiaire
                .count(); // opérateur final
        System.out.println("count : " + count);

        // limit + foreach
         famousNumbers.stream()
                .limit(3) // opérateur intermédiaire : le stream ne contient que les 3 premiers elements (0,1,55)
                .forEach(System.out::println); // opérateur final
        // skip + max
        Optional<Integer> max =  famousNumbers.stream()
                .skip(3) // opérateur intermédiaire : le stream ne contient pas les 3 premiers elements (0,1,55)
                .max(Integer::compareTo); // opérateur terminal se basant sur la comparaison des entiers
        System.out.println(max.get()); // vu qu'on a skip les 3 premiers éléments le max est 37 au lieu de 55

        // distinct + collect
        List<String> fruitsUniques =  fruits.stream()
                .distinct() // opérateur intermédiaire qui va enlever les doublons donc le mot Banane
                .collect(Collectors.toList()); // Collecter le stream dans une liste
        System.out.println(fruitsUniques); // Vu que Banane est répété on ne doit le voir qu'une seule fois

        // sorted + toArray
        String[] fruitsSorted = fruits.stream()
                .sorted() // tri donc le sens sera Banane, Banane, Kiwi, Mangue
                .toArray(String[]::new); // On collecte les éléments du stream dans un tableau
        System.out.println(Arrays.toString(fruitsSorted));

        // map + sorted + distinct + forEach
        fruits.stream()
                .map(String::toUpperCase) // transform each name to the upper case
                .sorted()
                .distinct() // intermediate operation: keep only unique words
                .forEach(System.out::println); // print every company

    }
}
