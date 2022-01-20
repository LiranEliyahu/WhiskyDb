package Wrapper.CheckType.Collection.Commands;

import MemoryInteraction.Directory.DirContent;

public class Show {
    public Show(String[] command){
        new DirContent().getContent(pathCreator(command));
    }

    private String pathCreator(String[] command){
        String currLocation = "C:\\Users\\liran\\Documents\\";
        return currLocation +command[1];
    }
}
