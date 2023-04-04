package lr11;

public class RecursionExample2 {
    public static void main(String[] args) {
        m(1);
    }
    public static void m(int i) {
        if (2*i+1<20) {
            m(2*i+1);
        }
        System.out.println("x= "+i);
    }
}
