package lr8.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Buf_RW_2 {
    public static void main(String[] args) throws IOException { BufferedReader br = null;
        PrintWriter out=null;
        try { 
        br = new BufferedReader(
        new InputStreamReader(
        new FileInputStream("./test_files/MyFile7.txt"),"UTF8"));
        out = new PrintWriter("./test_files/MyFile8.txt","UTF8"); 
        int lineCount = 0; String s;
        while ((s = br.readLine()) != null) { lineCount++; out.println(lineCount + ": " + s);
        }
        } catch (IOException e) { System.out.println("Ошибка !!!!!!!!"); }
        finally{ 
            br.close();
            out.flush();
            out.close();
        }
    }
}

