package lr9;

public class Demo_Exception14 {
    public class Main {
        public static void m(int x) throws ArithmeticException {
            int h = 10 / x;
        }
    }
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
