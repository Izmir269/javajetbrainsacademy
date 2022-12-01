package Annotations;

public class Annotation {
    @SuppressWarnings(value = "unused")
    public void printHello() {
        System.out.println("Hello!");
    }


    /*
    Depuis Java 9 l'annotation @Deprecated a deux paramètres :
    - since : pour indiquer depuis quelle version la méthode ou etc a été déprécié
    - forRemoval : un booléen pour indiquer si ça va être supprimer ou pas dans des futures versions
     */
    @Deprecated(since = "5.3", forRemoval = true)
    public void printHello2() {
        System.out.println("Hello!");
    }
}
