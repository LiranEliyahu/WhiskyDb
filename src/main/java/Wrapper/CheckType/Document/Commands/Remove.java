package Wrapper.CheckType.Document.Commands;

import MemoryInteraction.File.RemoveDocument;

public class Remove {
    public Remove(String[] command){
        info(new RemoveDocument().remove(createPath(command)));
    }

    private String createPath(String[] command){
        return "C:\\Users\\liran\\Documents\\" + command[0] + "\\" + command[2] +".json";
    }

    public void info(boolean check){
        if(check){
            System.out.println("removed successfully!");
        }else{
            System.out.println("error couldn't remove file");
        }
    }
}
