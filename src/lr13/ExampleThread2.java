package lr13;

public class ExampleThread2 {
    public static void main(String[] args)throws InterruptedException {
        Thread t=new Thread(()->{
            for(int i=1;i<10;i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
            
        });
        t.start();
        t.join();
    }
}
