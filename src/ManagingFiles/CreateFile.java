package ManagingFiles;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        /**
         * Pour créer un fichier dans le système on doit :
         * - créer une instance de Java.io.File
         * - appeler la méthode createNewFile() de cette instance
         */
        File file = new File("./Explications.txt");
        try {
            boolean createdNew = file.createNewFile();
            if (createdNew) {
                System.out.println("The file was successfully created.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (IOException e) {
            System.out.println("Cannot create the file: " + file.getPath());
        }
    }
}
