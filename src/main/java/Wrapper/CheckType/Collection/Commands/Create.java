package Wrapper.CheckType.Collection.Commands;

import MemoryInteraction.Directory.NewDir;

public class Create {
    public Create(String[] command){
        if (new NewDir().createDir(pathCreator(command))){
            System.out.println("collection was created!");
        }else{
            System.out.println("error, collection was not created or already exists" +
                    "use command show to check");
        }
    }

    private String pathCreator(String[] command){
        String currLocation = "C:\\Users\\liran\\Documents\\";
        return currLocation +command[1] + "\\";
    }
}
