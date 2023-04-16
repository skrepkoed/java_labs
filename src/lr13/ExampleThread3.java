package lr13;

public class ExampleThread3 {
    private static int number=1;
    private static final Object lock=new Object();
    public static void main(String[] args) {
       Thread t1 = new Thread(()->{
        synchronized(lock){
            while(number<10){
                if (number%2==0) {
                    System.out.println(Thread.currentThread().getName()+": "+number);
                    number++;
                }else{
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
            }
        }
    });
    Thread t2 = new Thread(()->{
        synchronized(lock){
            while(number<10){
                if (number%2!=0) {
                    System.out.println(Thread.currentThread().getName()+": "+number);
                    number++;
                }else{
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
            }
        }
    });

    t1.setName("evenThread");
    t2.setName("oddThread");

    t1.start();
    t2.start();


    }
    
}
