import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by Liuda on 3/4/2018.
 */
public class CreateJson {

    public static void main(String[] args){
            //throws JsonMappingException{



        CD cdNirvana = new CD("d1","d2","d3","d4","d5","d6","d7");
        CD cdCranberries = new CD("a1","a2","a3","a4","a5","a6","a7");
        ArrayList<CD> my_list = new ArrayList<CD>();
        my_list.add(cdNirvana);
        my_list.add(cdCranberries);
        Catalog music  = new Catalog(my_list);

        ObjectMapper mapper = new ObjectMapper();
      //  ObjectNode objectNode1 = mapper.createObjectNode();


        try {
            mapper.writeValue(new File("music.json"), cdNirvana);
        }catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }



    }
}
