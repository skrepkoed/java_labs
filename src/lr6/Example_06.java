package lr6;

public class Example_06 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[]result=firstEntry(3, array1);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] firstEntry(int number, int[]array) {
        if (number>array.length) {
            int[] copyArray=new int[array.length];
            return fillArray(array, copyArray);
        }else{
            int[] firstNumbers=new int[number];
            return fillArray(array, firstNumbers);
        }
       
    }

    public static int[] fillArray(int[] array, int[]fillArray) {
        int counter=0;
        for (int i : fillArray) {
            fillArray[counter]=array[counter]+i;
            counter+=1;
        }
        return fillArray;
    }
}

