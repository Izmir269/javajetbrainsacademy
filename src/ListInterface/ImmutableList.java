package ListInterface;

import java.util.Arrays;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        /**
         * Créer une liste immutable avec la méthode of de l'interface List
         * Utile pour créer une liste de constantes ou une liste pour des tests
         */
        List<String> emptyList = List.of(); // 0 elements
        List<String> names = List.of("Larry", "Kenny", "Sabrina"); // 3 elements
        List<Integer> numbers = List.of(0, 1, 1, 2, 3, 5, 8, 13);  // 8 elements

        /**
         * Exemple d'utilisation des méthodes.
         * Vu que c'est une liste immutable seule les méthodes qui ne change pas la liste d'origine marchent
         * si on a une UnsupportedOperationException
         */
        List<String> daysOfWeek = List.of(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );

        System.out.println(daysOfWeek.size()); // 7
        System.out.println(daysOfWeek.get(1)); // Tuesday
        System.out.println(daysOfWeek.indexOf("Sunday")); // 6

        List<String> weekDays = daysOfWeek.subList(0, 5);
        System.out.println(weekDays); // [Monday, Tuesday, Wednesday, Thursday, Friday]

        /**
         * Avant Java 9 un autre moyen de créer une liste immutable
         */
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
    }
}
