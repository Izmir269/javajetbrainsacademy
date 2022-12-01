import java.util.*;

public class ArrayAsParameters {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        swapFirstAndLastElements(arr);
        System.out.println(Arrays.toString(arr));
        printNumberOfArguments(arr);
        //LinkedList<Integer> list = new ArrayList<>(); non
        LinkedList<Integer> list = new LinkedList<>(new ArrayList<>());
        Collection<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();

    }
    // Le plus iportant à comprendre ici c'est que passer un type référence en argument ne change pas sa
    // référence en sortie de la méthode MAIS change les valeurs
    public static void swapFirstAndLastElements(int[] nums) { // nums is an array
        if (nums.length < 1) {
            return; // it returns nothing, i.e. just exits the method
        }

        int temp = nums[nums.length - 1]; // save the last element in a temporary local variable
        nums[nums.length - 1] = nums[0];  // now, the last element becomes the first
        nums[0] = temp;                   // now, the former first element becomes the last
    }
    //On peut passer un nombre arbitraire d'argument => Varags
    // Ici la méthode a un seul paramètre mais peut-être appelé avec plusieurs arguments
    // Si une méthode a plusieurs paramètre, le paramètre Varag doit être le dernier que tu passes
    public static void printNumberOfArguments(int... numbers) {
        System.out.println(numbers.length);
    }
}
