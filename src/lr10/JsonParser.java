package lr10;

import java.io.FileReader;
import java.util.Scanner;

import org.apache.poi.hssf.record.LbsDataSubRecord;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.File;
import java.io.FileWriter;

public class JsonParser {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            addBook("src/lr10/example.json");
            String path = "src/lr10/example.json";
            Object obj = parser.parse(new FileReader(path));    
            JSONObject jsonobj = (JSONObject) obj;
            System.out.println("Root element:"+jsonobj.keySet().iterator().next());
            JSONArray jsonarray = (JSONArray) jsonobj.get("books");
            print_books(jsonarray);
            print_books(search_by(jsonobj, "title","ccde"));
            delete_books_by(path,jsonobj,"title", "abc");
        } catch (Exception e) {
            // TODO: handle exception
        }  
    }

    public static void print_books(JSONArray jsonarray) {
        for (Object o : jsonarray) {
            JSONObject book = (JSONObject) o;
            System.out.println("\nCurrent element: book");
            System.out.println("Title: "+book.get("title"));
            System.out.println("Author: "+book.get("author"));
            System.out.println("Year: "+book.get("year"));
        }
    }

    public static void delete_books_by(String path,JSONObject library,String attr, String value) {
        JSONArray jsonarray = (JSONArray) library.get("books");
        JSONArray for_deletion= search_by(library, attr, value);
        for (Object bookObject : for_deletion) {
            jsonarray.remove(bookObject);
        }
        writeToJson(path, library);
        System.out.println("Deleted: ");
        print_books(for_deletion);

    }

    public static JSONArray search_by(JSONObject library,String attr, String value) {
        JSONArray jsonarray = (JSONArray) library.get("books");
        JSONArray result =new JSONArray();
        for (Object o : jsonarray) {
            JSONObject book = (JSONObject) o;
            if(book.get(attr).equals(value)){
                result.add(book);
            }
        }
        return result;
    }

    public static void writeToJson(String path, JSONObject library) {
        try {
            FileWriter file =new FileWriter(path);
            file.write(library.toJSONString());
            file.flush();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addBook(String path) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(path));
            JSONObject library = (JSONObject) obj;  
            Scanner input = new Scanner(System.in);
            JSONObject newBook = new JSONObject();
            System.out.println("Enter book title: ");
            newBook.put("title", input.nextLine());
            System.out.println("Enter book year: ");
            newBook.put("year", input.nextLine());
            System.out.println("Enter book author: ");
            newBook.put("author", input.nextLine());
            input.close();
            JSONArray jsonarray = (JSONArray) library.get("books");
            jsonarray.add(newBook);
            writeToJson(path, library);
        
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
