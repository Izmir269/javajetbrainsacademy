package ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MutableLists {
    public static void main(String[] args) {
        /**
         * Implémentation ArrayList
         */
        List<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers); // [15, 10, 20]

        numbers.set(0, 30); // no exceptions here

        System.out.println(numbers); // [30, 10, 20]
        /**
         * Passer d'une liste immutable à mutable
         */
        List<String> immutableList = Arrays.asList("one", "two", "three");
        List<String> mutableList = new ArrayList<>(immutableList);

        /**
         * Implémentation LinkedList
         * Représente une liste doublement chaînée basée sur des nodes connectées entre elles
         */
        List<Integer> numbers2 = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers); // [10, 20, 30]
    }
}
