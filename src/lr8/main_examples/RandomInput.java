package lr8.main_examples;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class RandomInput {
    public File f;
    public RandomInput(File file_to) {
        f=file_to;
    }

    public void create() {
        System.out.println("Working");
        try {
            PrintWriter out =new PrintWriter(f.getAbsolutePath(),"UTF8");  
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
            System.out.println("Worked");
        } catch (Exception e) {
            System.out.println("Smth wrong"+e);
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

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }
}