package StreamFiltering;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFiltering {
    public static void main(String[] args) {
        List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
        List<String> programmingLanguages = Arrays.asList("Java", "", "scala", "Kotlin", "", "clojure");

        // méthode filter : garder les nombre en 11 et 23 inclus
        List<Integer> filteredPrimeNumbers = primeNumbers.stream() // create a stream from the list
                .filter(n -> n >= 11 && n <= 23) // filter elements
                .collect(Collectors.toList());   // collect elements in a new list
        System.out.println(filteredPrimeNumbers);

        // On peut créer le prédicat séparemment puis l'appliquer
        Predicate<Integer> between11and23 = n -> n >= 11 && n <= 23; // instantiate the predicate

        List<Integer> filteredPrimeNumbers2 = primeNumbers.stream() // create a stream from the list
                .filter(between11and23)        // pass the predicate to the filter method
                .collect(Collectors.toList()); // collect elements in a new list
        System.out.println(filteredPrimeNumbers2);

        // On peut utiliser plusieurs filtres
        long count = programmingLanguages.stream()
                .filter(lang -> lang.length() > 0) // consider only non-empty strings
                .filter(lang -> Character.isUpperCase(lang.charAt(0))) // Garder que ceux avec la 1ere lettre en majuscule
                .count(); // count suitable languages
        System.out.println(count);
    }
}
