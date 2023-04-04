package lr11;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArrayRecursion {
    public static void main(String[] args) {
        Integer[] array=new Integer[3];
        setArrayRecursion(array);
        
        printOutRecArray(array);
        
    }

    public static void setArrayRecursion (Integer[]array,int count) throws IndexOutOfBoundsException {
        Integer stub=array[count];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value: ");
        array[count]=input.nextInt();
        try {
            setArrayRecursion(array,count+1);
        } catch (IndexOutOfBoundsException e) {
            input.close();
        }
    }
    public static void setArrayRecursion(Integer[]array) {
        int count=0;
        setArrayRecursion(array,count);
    }

    public static <T>void getArrayRecursion(T[]array, int count,Yield<T> yield)throws IndexOutOfBoundsException {
        yield.apply(array[count]);
        try {
            getArrayRecursion(array,count+1,yield);
        } catch (IndexOutOfBoundsException e) {

        }
    }

    public static <T> void getArrayRecursion(T[]array,Yield<T> yield) {
        int count=0;
        getArrayRecursion(array,count,yield);
    }

    public static <T> void printOutRecArray(T[]array) {
         getArrayRecursion(array, x->{
            System.out.println(x);
            return x;});
    }

    public interface Yield<T>{
        T apply(T arg);
    }
}
