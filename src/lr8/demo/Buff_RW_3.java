package lr8.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buff_RW_3 {
    public static void main(String[] args)throws IOException {
        BufferedReader  br=null;
        BufferedWriter out=null;
        try {
            br= new BufferedReader(new FileReader("./test_files/MyFile3.txt"),1024);
            out= new BufferedWriter(new FileWriter("./test_files/MyFile4.txt"));
            int lineCount=0;
            String s;
            while ((s=br.readLine())!=null) {
                lineCount++;
                System.out.println(lineCount+":"+s);
                out.write(s);
                out.newLine();
            }

        } catch (Exception e) {
            System.out.println("Ошибка");

        }finally{
            br.close();
            out.flush();
            out.close();
        }

    }
}
