package lr9;
class Main {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
                System.out.println("1");
            }
        }
    }
public class Demo_Exception8 {
    public static void main(String[] args) {
        System.out.println(Main.m());
    }
    
}
