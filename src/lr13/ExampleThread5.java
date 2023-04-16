package lr13;
import java.util.Random;

public class ExampleThread5 {
    private static int first_number;
 private static int second_number;
private static final Object lock=new Object();
public static void main(String[] args) throws InterruptedException {
Random random=new Random();
int[]array=new int[100000000];
first_number=array[0];
second_number=array[array.length/2+1];
for(int i=0;i<array.length;i++){
    array[i]=random.nextInt(100);
}
long start=System.currentTimeMillis();
Thread t1=new Thread(()->{
    synchronized(lock){
    for(int i=0;i<array.length/2;i++){
        if (array[i]>first_number) {
            first_number=array[i];
        }
    }
    }
});
Thread t2=new Thread(()->{
    synchronized(lock){
        for(int i=array.length/2;i<array.length;i++){
            if (array[i]>second_number) {
                second_number=array[i];
            }
        }
    }
});

t1.start();
t2.start();
long end=System.currentTimeMillis();
long result1=end-start;
int max=array[0];
start=System.currentTimeMillis();
for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
        max = array[i];
    }
}
end=System.currentTimeMillis();
long result2=end-start;
System.out.println("");
System.out.println(result1);
System.out.println(result2);
if (first_number>=second_number) {
    System.out.println(first_number);
}else{System.out.println(second_number);}
}
}
