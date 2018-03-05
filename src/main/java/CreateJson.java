import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class CreateJson {

    public static void main(String[] args){

        CD cdNirvana = new CD("d1","d2","d3","d4","d5","d6","d7");
        CD cdCranberries = new CD("a1","a2","a3","a4","a5","a6","a7");
        ArrayList<CD> my_list = new ArrayList<CD>();
        my_list.add(cdNirvana);
        my_list.add(cdCranberries);
        Catalog music  = new Catalog(my_list);

        ObjectMapper mapper = new ObjectMapper();
        Map<String,CD> myMap = new HashMap<String,CD>();
        myMap.put("Cd1",cdNirvana);
        myMap.put("Cd2",cdCranberries);

        try {
            mapper.writeValue(new File("music.json"), myMap);
        }catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }



    }
}
