package lr12;

import java.util.Arrays;
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int[]array=new int[10];
        int[]array1=new int[10];
        Random random= new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(200);
            array1[i]=random.nextInt(200);
        }
        System.out.println("Array: "+Arrays.toString(array));
        System.out.println("Array1: "+Arrays.toString(array1));
        int[]arrResult=findCommonElements(array,array1);
        System.out.println("Array result: "+Arrays.toString(arrResult));
    }
    public static int[] findCommonElements(int[]array,int[]array1) {
        return Arrays.stream(array).filter(x->Arrays.stream(array1).anyMatch(y->y==x)).toArray();
    }
}
