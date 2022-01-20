package Wrapper.CheckType.Document;


import Wrapper.CheckType.Document.Commands.Find;
import Wrapper.CheckType.Document.Commands.Insert;
import Wrapper.CheckType.Document.Commands.Remove;
import Wrapper.CheckType.Document.Commands.Update;

import java.util.Objects;

public class DocumentProcessor {
    public void getDocCommand(String[] command){
        if(Objects.equals(command[0], "insert")){
            new Insert();
        }
        else if(Objects.equals(command[0], "update")){
            new Update();
        }
        else if(Objects.equals(command[0], "remove")){
            new Remove();
        }
        else if(Objects.equals(command[0], "find")){
            new Find();
        }
    }
}
