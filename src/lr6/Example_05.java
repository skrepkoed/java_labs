package lr6;

public class Example_05 {
    public static void main(String[] args) {
        System.out.println(sumSquare(2));
        System.out.println(sumSquareRecursive(5));
    }
    public static int sumSquareRecursive(int number) {
        int sum=number;
        if (number!=0) {
           sum=(int)Math.pow(number, 2)+sumSquareRecursive(number-1);
        }
        return sum;
    }

    public static int sumSquare(int number) {
        int sum=0;
        while (number!=0) {
            sum+=(int)Math.pow(number, 2);
            number-=1;
        }
        return sum;
    }
}
