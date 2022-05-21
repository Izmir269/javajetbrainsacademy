package MethodReferences;

import java.util.function.BiFunction;

public class Methodeference {
/**
 * Exemple ici où on crée une référence à la méthode statique max de la classe Integer
 * Ici, Integer::max est une method reference à une méthode statique.
 * Ce code fonctionne car la définition de la méthode int max(int a, int b) correspond à ce qu'attend
 * BiFunction<Integer, Integer, Integer>: ils prennent tous les deux entiers en argument et envoie un entier
 *
 * On peut référencer des méthodes standards connus ou nos propres méthodes
 */
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> max = Integer::max;
        System.out.println(max.apply(50, 70)); // 70
        /**
         * Même chose avec une expression lambda
         */
        BiFunction<Integer, Integer, Integer> max2 = (x, y) -> Integer.max(x, y);
    }
}
