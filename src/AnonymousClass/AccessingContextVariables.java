package AnonymousClass;

public class AccessingContextVariables {
    /**
     * In the body of an anonymous class, it is possible to capture variables from a context where it is defined:
     *  - an anonymous class can capture members of its enclosing class (the outer class);
     *  - an anonymous class can capture local variables that are declared as final or are effectively final
     *  (i.e. the variable is not changed but it doesn't have the final keyword).
     */
    private static String BYE_STRING = "Auf Wiedersehen!"; // static constant membre de l'outer class

    public static void main(String[] args) {

        final String hello = "Guten Tag!"; // final local variable

        SpeakingEntity germanSpeakingPerson = new SpeakingEntity() {

            @Override
            public void sayHello() {
                System.out.println(hello); // it captures the local variable
            }

            @Override
            public void sayBye() {
                System.out.println(BYE_STRING); // it captures the constant field
            }
        };

        germanSpeakingPerson.sayHello();

        germanSpeakingPerson.sayBye();
    }
}
