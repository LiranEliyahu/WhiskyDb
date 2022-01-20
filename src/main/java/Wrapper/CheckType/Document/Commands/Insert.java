package Wrapper.CheckType.Document.Commands;

import MemoryInteraction.File.AddDocument;
import java.util.HashMap;

public class Insert {

    public Insert(String[] command){
        new AddDocument(parser(command[2].split("@")[1].split(",")),
                command[2].split("@")[0], command[0]);
    }

    private HashMap<String, String> parser(String[] values){
        HashMap<String, String> organizedValue = new HashMap<>();
        String[] temp;
        for (String value: values) {
            temp = value.split(":");
            organizedValue.put(temp[0],  temp[1]);
        }
        return organizedValue;
    }
}
