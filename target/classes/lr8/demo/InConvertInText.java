package lr8.demo;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class InConvertInText {
    public static void readAllByByte( Reader in) throws IOException { while (true) {
        int oneByte = in.read(); // читает 1 байт
        if (oneByte != -1) { // признак конца файла
        System.out.print((char) oneByte);
        } else {
        System.out.print("\n" + " конец ");
        break;
        }
        }
}

public static void main(String[] args) {
    try { 
    InputStream inFile = new FileInputStream("./test_files/MyFile1.txt");
    Reader rFile= new InputStreamReader(inFile,"UTF8");
    readAllByByte(rFile); System.out.print("\n\n\n"); inFile.close(); rFile.close();
    InputStream inUrl = new URL("http://google.com").openStream(); 

    Reader rUrl=new InputStreamReader(inUrl, "UTF8"); 

    readAllByByte(rUrl); System.out.print("\n\n\n"); inUrl.close();
    rUrl.close(); 
    InputStream inArray = new ByteArrayInputStream( new byte[] {5, 8, 3, 9, 11}); 
    Reader rArray=new InputStreamReader(inArray,"UTF8" );
    readAllByByte(rArray); System.out.print("\n\n\n"); inArray.close(); 
    rArray.close();
} catch (IOException e) { System.out.println("Ошибка: "+ e);
}
}}