package FunctionalDataProcessing;

import java.util.List;

public class Stream {
    public static void main(String[] args) {
        // Liste dans laquelle on souhaite compter les nombres supérieurs à 5

        List<Integer> numbers = List.of(1, 4, 7, 6, 2, 9, 7, 8);

        // Façon traditionnelle avec une loupe
        long count = 0;
        for (int i : numbers) {
            if (i > 5) count++;
        }
        System.out.println(count);

        // Avec les streams : filter est une opération intermédiaire tandis que count est une opération finale
        long count2 = numbers.stream()
                .filter(num -> num > 5)
                .count();
        System.out.println("count 2 : " + count2);

        // La deuxième fonction est plus facile à manier, par exemple ici on ne prend pas les 4 premiers elements de la liste
        // ça aurait généré plus de codes si on le faisait de manière traditionnelle
        long count3 = numbers.stream()
                .skip(4)  // skip 1, 4, 7, 6
                .filter(number -> number > 5)
                .count();  // 3
        System.out.println("count 3 : " + count3);

    }
}
