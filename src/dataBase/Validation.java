package dataBase;

import java.io.File;
import java.io.IOException;

public class Validation {
    public static void validate(String pathToFile) throws IOException {
        File fileDB = new File(pathToFile);

        if (!fileDB.exists()) {
            fileDB.createNewFile();
        }

        if (!fileDB.canRead()) {
            throw new IOException("File " + fileDB + " does not have permission to be read");
        }

        if (!fileDB.canWrite()) {
            throw new IOException("File " + fileDB + " does not have permission to be write");

        }
    }
}
