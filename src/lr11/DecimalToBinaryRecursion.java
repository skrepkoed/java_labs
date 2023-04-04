package lr11;

public class DecimalToBinaryRecursion {
    public static void main(String[] args) {
        System.out.println(toBinaryString(1000000000, ""));
    }
    public static String toBinaryString(int number, String result) {
        int remainder=number%2;
        
        if (!(number/2==1)) {
            number/=2;
            result=toBinaryString(number, result);
            
        }else{
            result+="1";
        }
        if (remainder==0) {
            result+="0";
        }else{
            result+="1";
        }
        return result;
    }
}
