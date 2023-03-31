package lr6;

public class Example_07 {
    public static void main(String[] args) {
        char[] array1={'a','b','c','d'};
        for (int i : ordArray(array1)) {
            System.out.println(i);
        }
    }
    public static int[] ordArray(char[] inputArray) {
        int[] result=new int[inputArray.length];
        int counter=0;
        for (char c : inputArray) {
            result[counter]=(int) c;
            counter+=1;
        }
        return result;
    }
}
