package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner iScanner=new Scanner(System.in);
        System.out.println( byte_sum(2, iScanner));
    }

    public static byte byte_sum(int length, Scanner input) {
        byte sum=0;
        for (int i=0; i<length;i++) {
            byte number;
            number=getByte(input);
            sum+=number;
        }
        input.close();
        return sum;
    }

    public static byte getByte(Scanner input) {
        byte result=0;
        try{
            result=input.nextByte();
            return result;
        }catch(InputMismatchException e ){   
            input=new Scanner(System.in);
            return getByte(input);
        }
    }
}
