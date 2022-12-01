package FunctionalInterface;

public class FunctionalInterface {
    public static void main(String[] args) {

        /* 1) Implémentaion de l'interface fonctionnelle par une class anonyme
         Ce code fonctionne mais contient trop de lignes de code pour une seule ligne utile(10) */
        Func<Long, Long> square = new Func<Long, Long>() {
            @Override
            public Long apply(Long val) {
                return val * val;
            }
        };
        System.out.println(square.apply(10L));
        /**
         * 2) Expression lamda
         */
        Func<Long, Long> square2 = (longNumber) -> longNumber * longNumber;
        System.out.println(square2.apply(10L));

        /**
         * Method Reference
         * Dans ce cas, le nombre et type d'arguments et le type de retour d'une méthode doit correspondre
         * au nombre d'arguments, types et retour de la seule méthode abstraire de l'interface fonctionnelle
         */
        Func<Long, Long> square3 = FunctionalInterface::squareExemple;
    }
    public static long squareExemple(long l) {
        return l * l;
    }
}
@java.lang.FunctionalInterface
interface Func<T, R> {
    R apply(T val); // single abstract method
}
