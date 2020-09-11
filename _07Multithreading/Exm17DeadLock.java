package _07Multithreading;

public class Exm17DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: popitka zaxvotit monitor lock1 ");
        synchronized (Exm17DeadLock.lock1) {
            System.out.println("Thread10: monitor lock1 zaxvacen! ");

            System.out.println("Thread10: popitka zaxvotit monitor lock2 ");
            synchronized (Exm17DeadLock.lock2) {
                System.out.println("Thread10: monitor lock2 zaxvacen! ");
            }
        }
    }

}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: popitka zaxvotit monitor lock2 ");
        synchronized (Exm17DeadLock.lock2) {
            System.out.println("Thread20: monitor lock2 zaxvacen! ");

            System.out.println("Thread20: popitka zaxvotit monitor lock1 ");
            synchronized (Exm17DeadLock.lock1) {
                System.out.println("Thread20: monitor lock1 zaxvacen! ");
            }
        }
    }

}
