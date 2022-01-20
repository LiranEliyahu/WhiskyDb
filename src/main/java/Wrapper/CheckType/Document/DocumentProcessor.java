package Wrapper.CheckType.Document;


import Wrapper.CheckType.Document.Commands.Find;
import Wrapper.CheckType.Document.Commands.Insert;
import Wrapper.CheckType.Document.Commands.Remove;
import Wrapper.CheckType.Document.Commands.Update;

import java.util.Objects;

public class DocumentProcessor {
    public void getDocCommand(String[] command){
        if(command.length > 1) {
            if (Objects.equals(command[1], "insert")) {
                new Insert();
            } else if (Objects.equals(command[1], "update")) {
                new Update();
            } else if (Objects.equals(command[1], "remove")) {
                new Remove();
            } else if (Objects.equals(command[1], "find")) {
                new Find();
            }else{
                System.out.println("try again, type help for info");
            }
        }else{
            System.out.println("try again, type help for info");
        }
    }
}
