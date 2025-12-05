package S051;

import java.io.File;
import java.io.IOException;

public class DirectoryAlphabetically {
    public static void main(String[] args) {

    try {
        File DirectoryAlphabeticallyFile = new File("DirectoryAlphabeticallyFile.txt");
            if (DirectoryAlphabeticallyFile.createNewFile()) {
                System.out.println("File created: " + DirectoryAlphabeticallyFile.getName());
            } else {
                System.out.println("The File already exists");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

