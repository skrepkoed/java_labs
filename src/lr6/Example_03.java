package lr6;
import java.util.Arrays;
public class Example_03 {
    public static void main(String[] args) {
        
        System.out.println(varArr.maxFromArr(1,2,5,10));
        System.out.println(varArr.minFromArr(1,2,5,10));
        System.out.println(varArr.median(1,2,5,10));
        int[] numbers={1,2,3,7};
        System.out.println(varArr.median(numbers));
    }
}

class varArr{

    public static int maxFromArr(int ...numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    
    public static int minFromArr(int ...numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double median(int ... numbers) {
        int sum=0;
        for (int i : numbers) {
            sum+=i;
        }
        double median=sum/(double)numbers.length;
        return median;
    }
}
