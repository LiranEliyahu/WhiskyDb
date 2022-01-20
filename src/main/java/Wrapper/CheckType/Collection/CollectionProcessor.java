package Wrapper.CheckType.Collection;

import Wrapper.CheckType.Collection.Commands.Create;
import Wrapper.CheckType.Collection.Commands.Delete;
import Wrapper.CheckType.Collection.Commands.Show;

import java.util.Objects;

public class CollectionProcessor {
    public void getCollCommand(String[] command){
        if(Objects.equals(command[0], "show")){
            new Show();
        }
        else if(Objects.equals(command[0], "delete")){
            new Delete();
        }
        else if(Objects.equals(command[0], "create")){
            new Create();
        }
    }
}
