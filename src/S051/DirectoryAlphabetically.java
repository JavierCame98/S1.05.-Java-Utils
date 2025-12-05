package S051;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

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

    public void listAlphabeticallyTheDirectory(File listDirectory){
        File[] entries = listDirectory.listFiles();
        Arrays.stream(entries).sorted(Comparator.comparing(File :: getName, String.CASE_INSENSITIVE_ORDER))
                .forEach(entry -> System.out.println(entry.getName()));

    }
}

