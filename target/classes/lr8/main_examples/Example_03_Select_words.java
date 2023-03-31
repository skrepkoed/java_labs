package lr8.main_examples;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Example_03_Select_words {
   public static void main(String[] args) {
    try {
        File f1 = new File("./test_files/war_and_peace.txt");
        File f2 = new File("./test_files/modified_peace.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1.getAbsolutePath()),"UTF8"));
        PrintWriter bw = new PrintWriter(f2.getAbsolutePath(),"UTF8");
        String s;
        List <String> consonants= Arrays.asList("й","ц","к","н","г","ш","щ","з","х","ф",
        "в","п","р","л","д","ж","ч","с","м","т","б");
        int lineCounter=0;
        while ((s=br.readLine())!=null) {
            lineCounter+=1;
            String resultString=""+lineCounter+": ";
            String[] lineArray=s.toLowerCase().split(" ");
            int count=0;
            for (String word : lineArray) {
                String[] wordCharsArray=word.split("");
                if (consonants.contains(wordCharsArray[0]) ) {
                    count+=1;
                    resultString+=word+" ";
                }
            }
            if (count!=0) {
                bw.println(resultString+count);    
            }
             
        }
        bw.flush();
            bw.close(); 
    } catch (Exception e) {
        // TODO: handle exception
    }
   }
    
    
}