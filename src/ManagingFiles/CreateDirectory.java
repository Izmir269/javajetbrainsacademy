package ManagingFiles;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        /**
         * Pour créer un dossier, on commence par :
         * - Créer une instance de Java.io.File
         * - Appeler l'une de ses deux méthodes :
         *     + boolean mkdir() : crée le répertoire > renvoie true, si non false
         *     + boolean mkdirs() : créer le répertoire ainsi que tous les parents non existants
          */
        File file = new File("C://Users/izmirchaharoumane.zo/Desktop/Personal/JetBrainsExemple");

        boolean createdNewDirectory = file.mkdir();
        if (createdNewDirectory) {
            System.out.println("It was successfully created.");
        } else {
            System.out.println("It was not created.");
        }
        File file2 = new File("C://Users/izmirchaharoumane.zo/Desktop/Personal/JetBrainsMkdirs/test");
        boolean createNewDirectories = file2.mkdirs();
        System.out.println(createNewDirectories);
    }
}
