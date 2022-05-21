package MethodReferences;

import java.util.function.Function;

public class MethodReferenceTypes {
    /**
     * Il existe 4 types de référence
     * 1) On peut faire référence à une méthode statique
     * 2) On peut faire référence à une méthode d'instance d'un objet existant
     * 3) On peut faire référence à une méthode d'instance d'un objet d'un type particulier
     * 4) On peut faire référence à un constructeur
     */
    public static void main(String[] args) {
        // 1) La forme est généralement ClassName::staticMethodName
        // Exemple avec la méthode statique sqrt de la classe Math
        Function<Double, Double> sqrt = Math::sqrt;
        // Invocation
        System.out.println(sqrt.apply(10.2));

        // 2) La forme est généralement objectName :: instanceMethodName
        // Exemple avec un objet de la classe String et appel à la méthode indexOf
        String word = "Izmir Zoubert";
        Function<String, Integer> lengthOfWord = word::indexOf;
        System.out.println(lengthOfWord.apply("Z"));

        // 3) La forme générale est ClassName :: instanceMethodName
        // Exemple référence à une instance de laméthode doubleValue de la classe Long
        Function<Long, Double> converter = Long::doubleValue;;
        converter.apply(10L); // // the result is 100.0d

        // 4) La forme générale est ClassName :: new
        // Référence au cnstructeur de la classe Person
        Function<String, Person> inst = Person::new;
        Person me = inst.apply("Izmir");
        System.out.println(me);

    }
}
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
