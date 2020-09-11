package _07Multithreading;

public class Exm20Interruption {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");

        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(2000);
        interruptThread.interrupt();

        interruptThread.join();
        System.out.println("main end");

    }
}


class InterruptThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("Potok xotiat prervat");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Potok xotiat prervat vo vremia sna" + e);
                return;
            }
        }
        System.out.println(sqrtSum);

    }
}
