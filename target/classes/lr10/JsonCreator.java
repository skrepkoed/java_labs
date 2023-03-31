package lr10;

import java.io.File;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonCreator {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();
        JSONObject book = new JSONObject();

        book.put("title", "Война и мир");
        book.put("author", "Л.Н. Толстой");
        book.put("year", "1869");

        JSONObject book1 = new JSONObject();
        book1.put("title", "Мастер и Маргарита");
        book1.put("author", "М.А. Булгаков");
        book1.put("year", "1967");

        books.add(book);
        books.add(book1);

        library.put("books", books);

        try {
            FileWriter file =new FileWriter("src/lr10/example.json");
            file.write(library.toJSONString());
            file.flush();
            file.close();
            System.out.println("File created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
