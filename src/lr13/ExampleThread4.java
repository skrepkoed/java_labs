package lr13;

import java.util.ArrayList;

public class ExampleThread4 {
    public static void main(String[] args) {
        Runnable lambda=()->{
            System.out.println(Thread.currentThread().getName());
        };
        ArrayList<Thread> threadList=new ArrayList<Thread>();
        for(int i =0;i<10;i++){
           Thread thread= new Thread(lambda);
           thread.setName("Thread"+i);
           threadList.add(thread);
        }
        threadList.get(0).start();
        threadList.get(1).start();
        threadList.get(2).start();
        threadList.get(3).start();
        threadList.get(4).start();
        threadList.get(5).start();
        threadList.get(6).start();
        threadList.get(7).start();
        threadList.get(8).start();
        threadList.get(9).start();
    }
}
