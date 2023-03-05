package lr9;

public class Demo_Exception12 {
    public class Main {
        public static void m(String str, double chislo) {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }
        }
    }
    public static void main(String[] args) {
        Main.m(null, 0.000001);
    }
    
}
