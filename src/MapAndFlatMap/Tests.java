package MapAndFlatMap;

import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
        String [] numbers = {"1", "4", "2", "20", "18"};
        System.out.println(sortedAbsNumbers(numbers));
    }
    public static int[] sortedAbsNumbers(String[] numbers) {
        // write your code here
       int[] sortedNumbers =   Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .map(Math::abs)
                .sorted()
                .toArray();
        return sortedNumbers;
    }
}
