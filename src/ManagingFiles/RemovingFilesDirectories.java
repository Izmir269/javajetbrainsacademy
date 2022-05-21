package ManagingFiles;

import java.io.File;

public class RemovingFilesDirectories {
    public static void main(String[] args) {
        /**
         * La méthode renvoie false si le fichier/répertoire n'existe pas mais également lorsqu'on
         * a des répertoires après le répertoire cible.
         * On ne pas donc supprimer ne hierarchie de fichiers, seulement un fichier particulier ou un dossier
         * vide.
         *
         */
        File file = new File("C://Users/izmirchaharoumane.zo/Desktop/Personal/JetBrainsMkdirs/test");

        if (file.delete()) {
            System.out.println("It was successfully removed.");
        } else {
            System.out.println("It was not removed.");
        }
    }
    /**
     * Pour supprimer un dossier qui n'est pas vide, on doit d'abord au préalable supprimer tous les fichiers
     * et répertoires qui sont dans ce dossier.
     * La méthode delete() ne leve d'exception IOException
     * Il existe une autre méthode pour supprimer des fichiers : deleteOnExit(). Supprime un fichier ou un
     * répertoire lorsque notre programme s'arrête. Aucun moyen de revenir en arrière.
     */
    public void deleteDirRecursively(File dir) {
        File[] children = dir.listFiles();
        for (File child : children) {
            if (child.isDirectory()) {
                deleteDirRecursively(child);
            } else {
                child.delete();
            }
        }

        dir.delete();
    }
}
