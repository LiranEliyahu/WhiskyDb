package MemoryInteraction.Directory;

import java.io.File;

public class DirContent {
    public void getContent(String path){
        File file  = new File(path);
        File[] files = file.listFiles();
        if(files != null){
            if(files.length > 0) {
                for (File f : files) {
                    System.out.println("*" + f);
                }
            }
            else{
                System.out.println("empty collection");
            }
        }
        else{
            System.out.println("empty collection");
        }
    }
}
