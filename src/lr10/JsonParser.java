package lr10;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/lr10/example.json"));    
            JSONObject jsonobj = (JSONObject) obj;
            System.out.println("Root element:"+jsonobj.keySet().iterator().next());
            JSONArray jsonarray = (JSONArray) jsonobj.get("books");
            for (Object o : jsonarray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nCurrent element: book");
                System.out.println("Title: "+book.get("title"));
                System.out.println("Author: "+book.get("author"));
                System.out.println("Year: "+book.get("year"));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    }
}
