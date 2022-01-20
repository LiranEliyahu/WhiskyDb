package MemoryInteraction.Directory;

import java.io.File;

public class NewDir {
    public boolean createDir(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return file.mkdir();
        }
        return false;
    }
}
