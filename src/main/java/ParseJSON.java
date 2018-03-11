import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ParseJSON {
    public static void main(String[] args){
        try {
            ObjectMapper mapper = new ObjectMapper();
            //deserialization of my map
            Map obj = mapper.readValue(new File("music.json"), Map.class);
            String objPrint = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println(objPrint);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

