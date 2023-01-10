package lr6;

import java.util.Arrays;

public class Example_10 {
    public static void main(String[] args) {
        for (int i : maxMin(1,2,3,10)) {
            System.out.println(i);
        }
    }
    public static int[] maxMin(int...numbers) {
        int[] result={maxFromArr(numbers),minFromArr(numbers)};
        return result;
    }
    public static int maxFromArr(int ...numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    
    public static int minFromArr(int ...numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
