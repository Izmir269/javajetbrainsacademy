package AnonymousClass;

public class AnonymousClass {

    public static void main(String[] args) {

        // Dans les deux exemples ci-dessous, englishSpeakingPerson et cat sont deux classes anonymes
        // différentes qui implémentent la même interface (SpeakingEntity)

        // Une classe anonyme qui est déclaré et instancié en même temps
        SpeakingEntity englishSpeakingPerson = new SpeakingEntity() {

            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }

            @Override
            public void sayBye() {
                System.out.println("Bye!");
            }
        };
        englishSpeakingPerson.sayBye();
        // Une autre classe anonyme
        SpeakingEntity cat = new SpeakingEntity() {

            @Override
            public void sayHello() {
                System.out.println("Meow!");
            }

            @Override
            public void sayBye() {
                System.out.println("Meow!");
            }
        };
        cat.sayBye();
    }

}

// une interface avec deux méthodes
interface SpeakingEntity {

    void sayHello();

    void sayBye();
}
//Une classe classe anonyme qui est déclaré et instancié en même temps

