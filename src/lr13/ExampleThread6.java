package lr13;
import java.util.Random;
public class ExampleThread6 {
    private static long first_number;
 private static long second_number;
private static final Object lock=new Object();
public static void main(String[] args) throws InterruptedException {
Random random=new Random();
int[]array=new int[100000000];
first_number=0;
second_number=0;
for(int i=0;i<array.length;i++){
    array[i]=random.nextInt(3);
}
Thread t1=new Thread(()->{
    synchronized(lock){
    for(int i=0;i<array.length/2;i++){
        first_number+=array[i];
    }
    }
});
Thread t2=new Thread(()->{
    synchronized(lock){
        for(int i=array.length/2;i<array.length;i++){
            second_number+=array[i];
        }
    }
});
t1.start();
t2.start();
System.out.println("");
System.out.println(first_number+second_number);

}
}
