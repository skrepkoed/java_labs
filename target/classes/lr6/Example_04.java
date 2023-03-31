package lr6;

public class Example_04 {
    
    public static void main(String[] args) {
        System.out.println(doubleFactorial(6));
        System.out.println(doubleFactorial(5));
        System.out.println(doubleFactorial(6));
        System.out.println(doubleFactorial(5));
    }
    public static int doubleFactorialRecursive(int number) {
        if (!((number==2)^(number==1))) {
            number=number*doubleFactorialRecursive(number-2);
        }else{
            return number;
        }
         return number;   
        
    }

    public static int doubleFactorial(int number) {
        int factorial=number;
        while(!((number==2)^(number==1))){
            factorial=factorial*(number-2);
            number-=2;
        }
        return factorial;
    }
}
