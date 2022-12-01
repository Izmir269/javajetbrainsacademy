package ReductionMethods;

import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ReductionExemples {
    public static void main(String[] args) {
        List<Integer> transactions = List.of(20, 40, -60, 5);
        // Somme des éléments
        Optional<Integer> count = transactions.stream().reduce((sum, transaction) -> sum + transaction);
        System.out.println(count.get());

        // On peut aussi indiquer la valeur initiale de la réduction(par défaut est le premier element de la collection)
        // Dan le cas si dessous la valeur initiale de sum sera 0 et transaction est 20
        Optional<Integer> count2 = Optional.ofNullable(transactions.stream().reduce(0, (sum, transaction) -> sum + transaction));
        System.out.println(count2.get());

        // Max
        Optional<Integer> sumWithReduce = transactions.stream().reduce((t1, t2) -> t2 > t1 ? t2 : t1);
        Optional<Integer> sumWithMax = transactions.stream().max(Integer::compareTo);
        System.out.println(sumWithMax.get());
        System.out.println(sumWithReduce.get());

        // Test
        System.out.println("Factoriel : " + factorial(5));

        System.out.println("sum : " + sum(10,20,2,3));


    }
    public static long factorial(long n) {
        // write your code here
        OptionalLong fact = LongStream.range(1, n + 1).reduce((sum, transaction) -> sum * transaction);
        return  fact.getAsLong();
    }
    public static int sum(int a, int b, int n, int m) {
        // write your code here
        return IntStream.rangeClosed(a,b).reduce(0,(t1, t2) -> t2 % n == 0 || t2 % m == 0 ? t1 + t2 : t1 + 0);
    }
}
