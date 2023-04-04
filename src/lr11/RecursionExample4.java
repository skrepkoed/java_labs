package lr11;

public class RecursionExample4 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int i) {
        int result;
        if (i==1) {
            return 1;
        }else{
            result=factorial(i-1)*i;
            return result;
        }
    }
}
