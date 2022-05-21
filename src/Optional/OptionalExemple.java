package Optional;

import java.util.Optional;

public class OptionalExemple {
    public static void main(String[] args) {
        /**
         * création de deux Optional (vide et non vide)
         */
        Optional<String> present = Optional.of("Somethong");
        Optional<String> absent = Optional.empty();
        /**
         * Tester si un objet est vide ou pas avec isPresent() ou isEmpty()
         */
        System.out.println(present.isPresent());
        System.out.println(absent.isPresent());
        System.out.println(present.isEmpty());
        System.out.println(absent.isEmpty());
        /**
         * OfNullable(voir Explications.txt)
         */
        String message = getRandomMessage(); // it may be null
        Optional<String> optMessage = Optional.ofNullable(message);
        System.out.println(optMessage.isPresent()); // true or false
        /**
         * Obtenir la valeur d'un Optional
         */
        Optional<String> optName = Optional.of("John");
        String name = optName.get(); // "John"
        System.out.println(name);

        Optional<String> optName2 = Optional.ofNullable(null);
        //String name2 = optName2.get(); // throws NoSuchElementException

        String nullableName = null;
        String name3 = Optional.ofNullable(nullableName).orElse("unknown");
        System.out.println(name3); // unknown

        /**
         * Conditions sur un Optional
         */
        Optional<String> companyName = Optional.of("Google");
        Optional<String> noName = Optional.empty();
        companyName.ifPresent((name5) -> System.out.println(name5.length())); // 6
        noName.ifPresent((name5) -> System.out.println(name5.length())); // N'affiche rien car noName est vide

        Optional<String> optName3 = Optional.empty();

        optName.ifPresentOrElse(
                (name9) -> System.out.println(name9.length()),
                () -> System.out.println(0) // alternative si la valeur est nulle
        );

    }
    private static String getRandomMessage() {
        return Math.random() > 0.5 ? "I am not null" : null;
    }
}
