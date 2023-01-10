package lr8.demo;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_Sam_Buffer {
    public static void readAllByByte(InputStream in) throws IOException {
        byte buff[]=new byte[5];
        while (true) {
            int count=in.read(buff);
            if (count!=-1) {
                System.out.println("количество="+count+",buff="+Arrays.toString(buff)+",str="
                +new String(buff,0,count,"UTF8"));
            }else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        InputStream inFile=null;
        try{
            inFile=new FileInputStream("./test_files/test.txt");
            readAllByByte(inFile);
        }catch(IOException e){
            System.out.println("Ошибка отрыттия-закрытия файла"+e);
        }finally{
            if (inFile!=null) {
                try{
                    inFile.close();
                }catch(IOException ignore){
                    /*NOP */
                }
            }
        }
    }
}
