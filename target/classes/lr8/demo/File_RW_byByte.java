package lr8.demo;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class File_RW_byByte {
    public static void main(String[] args) throws IOException {
         
        FileReader in=null;  
        FileWriter out =null; try {
        in = new FileReader("./test_files/MyFile1.txt"); 
        out= new FileWriter("./test_files/MyFile2.txt", true); 
        
        int oneByte; 
        while ((oneByte = in.read()) != -1) {
        out.append((char)oneByte); 
        System.out.print((char)oneByte);
        }
        } catch (IOException e) { System.out.println("Ошибка!!!! ");
        }
        finally{
        in.close();
        out.close();
        } }}
