package lr6;

public class Example_02 {
    public static void main(String[] args) {
        StaticInt.getAndIncrField();
        StaticInt.getAndIncrField();
        StaticInt.getAndIncrField();
    }
}

class StaticInt{
    private static int intField=0;
    public static void getAndIncrField() {
        System.out.println(intField);
        intField+=1;
    }
}