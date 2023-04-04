package lr12;

import java.util.Arrays;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        int[]array=new int[10];
        Random random= new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(array));
        int[]arrResult=filterEvenNumbers(array);
        System.out.println("Array result: "+Arrays.toString(arrResult));
    }
    public static int[] filterEvenNumbers(int[] array) {
        return Arrays.stream(array).filter(x->x%2==0).toArray();
    }
}
