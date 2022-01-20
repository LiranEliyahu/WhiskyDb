package Wrapper.CheckType.Collection;

import Wrapper.CheckType.Collection.Commands.Create;
import Wrapper.CheckType.Collection.Commands.Delete;
import Wrapper.CheckType.Collection.Commands.Show;

import java.util.Objects;

public class CollectionProcessor {
    public void getCollCommand(String[] command){
        if(command.length > 1) {
            if (Objects.equals(command[0], "show")) {
                new Show(command);
            } else if (Objects.equals(command[0], "delete")) {
                new Delete(command);
            } else if (Objects.equals(command[0], "create")) {
                new Create(command);
            }else{
                System.out.println("try again, type help for info");
            }
        }
        else{
            System.out.println("try again, type help for info");
        }
    }
}
