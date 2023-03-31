package lr9;
class Main {
    public static int m() {
        try {
            System.out.println("0");
            return 55;    // выход из метода
        } finally {
            System.out.println("1");
        }
    }
}
public class Demo_Exception9 {
     
    public static void main(String[] args) {
        System.out.println(Main.m());
    }
    
}
