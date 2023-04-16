package lr13;

public class MultiThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(1));
        Thread t2 = new Thread(new MyRunnable(2));
        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable {
    private int threadNumber;
    
    public MyRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + threadNumber + ": " + i);
            try {
                Thread.sleep(1000); // Приостанавливаем поток на 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}