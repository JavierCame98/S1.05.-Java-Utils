package S051;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class DirectoryAlphabetically {

    public boolean createDirectory(String directoryName) {
            File newDirectory = new File(directoryName);
            if (newDirectory.exists()) {
                System.out.println("Directory already exists: " + newDirectory.getName());
                return false;
            }
            boolean directoryCreated = newDirectory.mkdir();
            if (directoryCreated) {
                System.out.println("Directory created: " + newDirectory.getName());
                return true;
            }
        return false;
    }

    public void listAlphabeticallyTheDirectory(File listDirectory){
        File[] entries = listDirectory.listFiles();
        Arrays.stream(entries).sorted(Comparator.comparing(File :: getName, String.CASE_INSENSITIVE_ORDER))
                .forEach(entry -> System.out.println(entry.getName()));

    }
}

