package LambdaExpressions;

import java.util.function.Function;

public class LambdaExpression {
/**
 *      L'un des cas les plus utilisés est de passer une expression lambda à une méthode et de l'appeler dedans
 */
    private static void printResultOfLambda(Function<String, Integer> function) {
    System.out.println(function.apply("HAPPY NEW YEAR 3000!"));
        }

    public static void main(String[] args) {
        // Pour tester la méthode on crée tout d'abord un objet puis on passe l'objet à la méthode
        Function<String, Integer> exemple = name -> name.length();
        printResultOfLambda(exemple);

         // On peut aussi passer la lambda sans une référence intermédiaire
        printResultOfLambda(name -> name.length());
        /**
         * Ce qui est important c'est qu'on peut paramétrer la même méthode (printResultOfLambda) avec un
         * comportement différent avec le runtime
         * Par exemple on va l'appeler pour compter le nombre de chiffre
         */
        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });

                                            // Exemple CLOSURE
        // Ici la lambda expression capture la variable finale hello
        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;

        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));
    }
}
