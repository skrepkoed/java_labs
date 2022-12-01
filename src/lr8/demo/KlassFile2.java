package lr8.demo;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

public class KlassFile2 {
    public static void readAllByByte(InputStream in)throws IOException {
        InputStreamReader isr=new InputStreamReader(in);
        InputStreamReader stream=new InputStreamReader(in, Charset.forName(isr.getEncoding()));
        while (true) {
            int oneByte=stream.read();
            if (oneByte!=-1) {
                System.out.print((char)oneByte);
            }else{
                System.out.println("\n");
                break;
            }
        }      
    }

    public static void readAllByByte(ByteArrayInputStream in) {
        while (true) {
            int oneByte=in.read();
            if (oneByte!=-1) {
                System.out.print(oneByte);
            }else{
                System.out.println("\n");
                break;
            }
        }
    }
    public static void main(String[] args)throws IOException {
        try{
            InputStream inFile= new FileInputStream("./test_files/test.txt");
            readAllByByte(inFile);
            System.out.println("\n\n");
            inFile.close();
            InputStream inURL = new URL("http://google.com").openStream();
            readAllByByte(inURL);
            System.out.println("\n\n");
            inURL.close();
            ByteArrayInputStream inArray=new ByteArrayInputStream(new byte[]{7,9,5,8});
            readAllByByte(inArray);
            System.out.println("\n\n");
            inArray.close();
        }catch (Exception e) {
            System.out.println("Ошибка"+e);
        }
    }
}
