package _07Multithreading;

public class Exm5 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Exm5());
        thread.start();
        System.out.println("Method main. Thread name = " + Thread.currentThread().getName());
    }
}
