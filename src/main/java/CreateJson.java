import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class CreateJson {

    public static void main(String[] args){

        CD cdNirvana = new CD("88","Nevermind","Nirvana","USA","Butch Vig","10.90","1991");
        CD cdCranberries = new CD("89","No Need to Argue","The Cranberries","UK","CBS Records","9.90","1994");
        ArrayList<CD> my_list = new ArrayList<CD>();
        my_list.add(cdNirvana);
        my_list.add(cdCranberries);

        ObjectMapper mapper = new ObjectMapper();
        Map<String,ArrayList<CD>> myMap = new HashMap<String,ArrayList<CD>>();
        myMap.put("CD",my_list);
        Map<String,Map> final_myMap = new HashMap<String,Map>();
        final_myMap.put("CATALOG",myMap);

        try {
            //serialization of map
            mapper.writeValue(new File("music.json"), final_myMap);
        }catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }



    }
}