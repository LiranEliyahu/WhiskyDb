package MemoryInteraction.File;

import java.io.File;

public class RemoveDocument {
    public boolean remove(String path){
        File file = new File(path);
        return file.delete();
    }
}
