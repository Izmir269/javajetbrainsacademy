package DefaultMethods;

public class DefaultMethod implements Feature {
    /**
     * Interface methods are abstract by default. It means that they can't have a body,
     * instead, they just declare a signature. Some kind of methods can have a body nevertheless.
     * Such methods are called default and are available since Java 8
     *
     * Pour appeler les méthodes par défaut on a besoin d'un objet d'une classe qui implemente l'interface
     * If you want to customize a default method in a class, just override it like a regular method
     */
    public static void main(String[] args) {
        Feature feature = new DefaultMethod();
        feature.action();
    }

}
// Exemple
interface Feature {
    default void action() {
        System.out.println("Default action");
    }
}

/*
Sometimes default methods are huge. To make it possible to decompose such methods, Java allows declaring
 private methods inside an interface
 */
// Exemple 2
interface Feature2 {
    default void action() {
        String answer = subAction();
        System.out.println(answer);
    }

    private String subAction() {
        return "Default action";
    }
}
