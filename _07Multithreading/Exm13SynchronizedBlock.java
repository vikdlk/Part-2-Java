package _07Multithreading;

public class Exm13SynchronizedBlock {
    public static void main(String[] args) {
        MyRunnable22 myRunnable22 = new MyRunnable22();
        Thread thread1 = new Thread(myRunnable22);
        Thread thread2 = new Thread(myRunnable22);
        Thread thread3 = new Thread(myRunnable22);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    volatile static int count = 0;
}

class MyRunnable22 implements Runnable {

    private void doWork2(){
        System.out.println("Uraa");
    }

    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}