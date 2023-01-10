package lr8.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Buf_WR_IO_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null; BufferedWriter bw=null; try { 
        br = new BufferedReader(
        new InputStreamReader(
        new FileInputStream("./test_files/MyFile5.txt"),"UTF8"));
        bw = new BufferedWriter(
        new OutputStreamWriter(
        new FileOutputStream("./MyFile6.txt"),"UTF8")); 
        int lineCount = 0; 
        String s;
        while ((s = br.readLine()) != null) { 
            lineCount++; System.out.println(lineCount + ": " + s);
            bw.write(lineCount + ": " + s); 
            bw.newLine(); 
        }
        } catch (IOException e) { System.out.println("Ошибка!!!!!!!!");
        }
        finally{
        br.close();
        bw.flush();
        bw.close();
        }
        }
}
