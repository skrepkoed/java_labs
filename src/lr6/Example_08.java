package lr6;

public class Example_08 {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        System.out.println(median(array));
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
