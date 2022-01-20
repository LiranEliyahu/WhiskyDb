package MemoryInteraction.Directory;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InsertFile {
    public void insertFile(String collection, String file) throws FileNotFoundException {
        File myFile = new File(collection, file);
        FileOutputStream fStream = new FileOutputStream(myFile);
        DataOutputStream data0 = new DataOutputStream(fStream);
    }
}
