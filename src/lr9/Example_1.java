package lr9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        System.out.println(average(5));
    }

    public static double average(int length) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int sum=0;
        for (int i=0; i<length;i++) {
            int number;
            number=getPositiveInteger(input);
            sum+=number;
            array.add(number);
        }
        input.close();
        return sum/(double)length;
    }
    public static int getPositiveInteger(Scanner input) {
        int result=0;
        try{
            result=input.nextInt();
            if (result<0) {
                throw new  NegativeNumberException();
            }
            return result;
        }catch(InputMismatchException e ){   
            input=new Scanner(System.in);
            return getPositiveInteger(input);
        }catch(NegativeNumberException e){
            input=new Scanner(System.in);
            return getPositiveInteger(input);
        }
    }
}

class NegativeNumberException extends Exception {
}
