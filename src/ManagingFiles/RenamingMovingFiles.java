package ManagingFiles;

import java.io.File;

public class RenamingMovingFiles {
    /**
     * Pour renommer et mode des fichiers on utilise la même méthode : renameTo()
     * La méthode renameTo lève NullPointerException dans le cas où un fichier de destination est nul.
     * La méthode renvoie false si on a pas les droits, seul la création renvoie une IOException
     */
    public static void main(String[] args) {
        File file = new File("C://Users/izmirchaharoumane.zo/Desktop/Personal/JetBrainsMkdirs/Test.txt");
        File renamedFile = new File("C://Users/izmirchaharoumane.zo/Desktop/Personal/JetBrainsMkdirs/Rename.txt");
        boolean renamed = file.renameTo(renamedFile);
        if (renamed) {
            System.out.println("It was successfully renamed.");
        } else {
            System.out.println("It was not renamed.");
        }
    }
}
