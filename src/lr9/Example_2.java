package lr9;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random =new Random();
        for (int[] is : matrix) {
            for (int i=0; i<is.length; i++) {
                is[i]=random.nextInt(5);
            }
        }
        Scanner input= new Scanner(System.in);
        get_row(matrix, input);
        input.close();
    }

    public static void get_row(int[][]matrix, Scanner input) {
        try{
        int row = input.nextInt();
        for (int[] is : matrix) {
            try{
            System.out.println(is[row]);
            }catch(ArrayIndexOutOfBoundsException e){
                input=new Scanner(System.in);
                get_row(matrix, input);    
            }
            
        }
        }
        catch(InputMismatchException e){
            input=new Scanner(System.in);
            get_row(matrix, input);
        }
        
    }
}
