package lr9;
class Main {
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }
}
public class Demo_Exception14 {
     
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            Main.m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }    
}
