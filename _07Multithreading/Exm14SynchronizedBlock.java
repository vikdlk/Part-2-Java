package _07Multithreading;

public class Exm14SynchronizedBlock {
    static int counter = 0;

    public static  void increment() {
        synchronized (Exm14SynchronizedBlock.class) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Exm12SynchronizeMethod.increment();
        }
    }
}