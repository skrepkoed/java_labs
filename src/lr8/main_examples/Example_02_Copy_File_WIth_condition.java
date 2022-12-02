package lr8.main_examples;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Example_02_Copy_File_WIth_condition {
    public static void main(String[] args) {
        File f1= new File("./test_files/RandomValuses.txt");
        RandomInput.create(f1);
        File f2= new File("./test_files/NewFile.txt");
        try {
            BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream(f1.getAbsolutePath()),"UTF8"));
            PrintWriter out= new PrintWriter(f2.getAbsolutePath(),"UTF8");
            int lineCount=0;
            String s;
            while ((s=br.readLine())!=null) {
                if (lineCount==1 ||(lineCount>1 && positive(s))) {
                    out.println(s);
                }
                lineCount+=1;
            }
            out.flush();
            out.close();    
        } catch (Exception e) {
            // TODO: handle exception
        }
           
    } 
    public static boolean positive(String str) {
        String [] strArray=str.split("");
        if (strArray[0].equals("-")) {
            return false;
        }else{
            return true;
        }
    }    
}

class RandomInput {
    public static void create(File f1) {
        try {
            PrintWriter out =new PrintWriter(f1.getAbsolutePath(),"UTF8");  
            String str="";
            for (String string : randomStrings(2)) {
                str+=string;
                out.println(str);
                str="";
            }
            for (double doubleNumber : randomDouble(5)) {
                str+=doubleNumber;
                out.println(str);
                str="";
            }
            out.flush();
            out.close();
        } catch (Exception e) {
            // TODO: handle exception
        }    
    }

    public static String[] randomStrings(int n) {
        String [] result=new String[n];
        String randomString="";
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < 10; i++) {
                randomString+=(char) Math.floor(Math.random() * 100);
            }
            result[k]=randomString;
            randomString="";    
        }
        return result;
    }

    public static double[] randomDouble(int n) {
        double [] result=new double[n];
        for (int k = 0; k < n; k++) {
            int positive=(int)Math.round(Math.random());
            if(positive==1){
                result[k]= Math.random() * 100; 
            }else{
                result[k]= Math.random() * -100; 
            }
               
        }
        return result;
    }
}


 