package MemoryInteraction.File;

import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class AddDocument {
    public AddDocument(HashMap<String, String> values, String fileName, String collectionName){
        writeToFile(insertValues(values), getPath(fileName, collectionName));
    }

    private JSONObject insertValues(HashMap<String, String> values){
        JSONObject jsonObject = new JSONObject();
        for (String key : values.keySet()) {
            jsonObject.put(key, values.get(key));
        }
        return jsonObject;
    }

    private String getPath(String name, String collection){
        return "C:\\Users\\liran\\Documents\\" + collection + "\\" + name + ".json";
    }

    private void writeToFile(JSONObject j, String path){
        try {
            FileWriter file = new FileWriter(path);
            file.write(j.toJSONString());
            file.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
