package MemoryInteraction.File;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class FindInDocument {
    public void find(String path, String key) {
        System.out.println(path);

        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(path)) {
            JSONObject object = (JSONObject) jsonParser.parse(reader);
            System.out.println(object.get(key));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
