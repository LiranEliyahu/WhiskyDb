package Wrapper.CheckType.Collection.Commands;

import MemoryInteraction.Directory.DeleteDir;
import java.io.File;

public class Delete {
    public Delete(String[] command){
        if (new DeleteDir().deleteDirectory(new File(pathCreator(command)))){
            System.out.println("collection was deleted!");
        }else{
            System.out.println("could not delete collection");
        }
    }

    private String pathCreator(String[] command){
        String currLocation = "C:\\Users\\liran\\Documents\\";
        return currLocation +command[1] + "\\";
    }
}
