package lr6;

public class Example_09 {
    public static void main(String[] args) {
        int[]array1={1,2,3,4,5,6,7,8,9};
        for (int i : reverseArray(array1)) {
            System.out.println(i);
        }
    }
    public static int[] reverseArray(int[] array) {
        int first=0;
        int last=array.length-1;
        int counter=0;
        while (counter!=array.length/2) {
            int a=array[first];
            int b=array[last];
            array[first]=b;
            array[last]=a;
            first+=1;
            last-=1;
            counter+=1;
        }
        return array;       
    }
}
