package StringBuilder;

public class StringBuilderExamples {
    public static void main(String[] args) {

        // NB : pour convertir un StringBuilder en String classique invoquer la méthode toString


        // Créer un objet vide de type StringBuilder
        StringBuilder empty = new StringBuilder();

        // Lui passer une chaîne de caractères
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // int length
        System.out.println(sb.length());

        // char charAt(int index)
        System.out.println(sb.charAt(0));

        // void setCharAt(int index, char c) => place le char à l'index donné
        StringBuilder sb2 = new StringBuilder("start");
        sb2.setCharAt(1, 'm');
        System.out.println(sb2); // "smart"

        // StringBuilder deleteCharAt(int index) => supprime le char à l'index donné et renvoie le StringBuilder résultant
        sb.deleteCharAt(0);
        System.out.println(sb);

        // StringBuilder append(String str) => concaténer deux string et renvoie un nouveau StringBuilder
        System.out.println(sb.append(sb2));

        // On peut l'invoquer plusieurs fois
        StringBuilder messageBuilder = new StringBuilder(); // empty

        messageBuilder
                .append("From: Kate@gmail.com\n")
                .append("To: Max@gmail.com\n")
                .append("Text: I lost my keys.\n")
                .append("Please, open the door!");

        System.out.println(messageBuilder);

        // StringBuilder insert(int offset, String str) => insère le string donné dans l'objet StringBuilder existant
        StringBuilder sb3 = new StringBuilder("I'm a programmer.");
        sb3.insert(6, "Java ");
        System.out.println(sb3); // I'm a Java programmer.

        // StringBuilder replace(int start, int end, String str) => remplace le substring des index donnés
        // (end est exclusive) avec le string donné
        StringBuilder sb4 = new StringBuilder("Let's use C#");
        sb4.replace(10, 12, "Java");
        System.out.println(sb4); // Let's use Java

        // StringBuilder delete(int start, int end) => supprime le substring, l'index de fon est exclusive
        StringBuilder sb5 = new StringBuilder("Welcome");
        sb5.delete(0, 3);
        System.out.println(sb5); // "come"

        // StringBuilder reverse() => inverser la chaîne de caractères
        StringBuilder sb6 = new StringBuilder("2 * 3 + 8 * 4");
        sb6.reverse();
        System.out.println(sb6); // "4 * 8 + 3 * 2"

        // Différence entre length() et capacity() => le nombre de caractères possibles de l'object
    }
}
