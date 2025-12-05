package S051;

import java.io.File;
import java.io.IOException;

public class DirectoryAlphabetically {

    public void createANewDirectory() {
        try {
            File directoryAlphabeticallyFile = new File("DirectoryAlphabeticallyFile.txt");
            directoryAlphabeticallyFile.mkdir();
            if (directoryAlphabeticallyFile.createNewFile()) {
                System.out.println("File created: " + directoryAlphabeticallyFile.getName());
            } else {
                System.out.println("The File already exists");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

