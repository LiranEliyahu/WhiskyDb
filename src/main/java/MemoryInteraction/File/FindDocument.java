package MemoryInteraction.File;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class FindDocument {
    public void find(String path) {
        System.out.println(path);
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(path)) {
            Object obj = jsonParser.parse(reader);
            System.out.println(obj);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
