package lr13;

import java.time.LocalTime;

public class ExampleThread1 {
    public static void main(String[] args) {
        Runnable lambda=()->{
            for(int i=0;i<99;i++){
                System.out.println(Thread.currentThread().getName()+": "+LocalTime.now());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1=new Thread(lambda);
        Thread t2=new Thread(lambda);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();    
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
