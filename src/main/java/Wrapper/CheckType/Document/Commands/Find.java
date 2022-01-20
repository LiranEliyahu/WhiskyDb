package Wrapper.CheckType.Document.Commands;

import MemoryInteraction.File.FindDocument;
import MemoryInteraction.File.FindInDocument;

import java.util.Objects;

public class Find {
    public Find(String[] command){
        checkCommand(command);
    }

    private void checkCommand(String[] command){
        if(Objects.equals(command[2].split("@")[0], "name")){
            new FindDocument().find(pathCreator(command));
        }else if(Objects.equals(command[2].split("@")[0], "key")){
            String[] temp = command[2].split("@")[1].split(",");
            new FindInDocument().find(pathCreatorForKey(command[0], temp[0]), temp[1]);
        }
    }

    private String pathCreatorForKey(String collection, String document){
        return "C:\\Users\\liran\\Documents\\" +
                collection + "\\" + document + ".json";
    }

    private String pathCreator(String[] command){
        return "C:\\Users\\liran\\Documents\\" +
                command[0] + "\\" + command[2].split("@")[1] + ".json";
    }
}
