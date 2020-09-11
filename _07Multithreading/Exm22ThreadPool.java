package _07Multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exm22ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 10; i++) {
            scheduledExecutorService.execute(new RunnableImpl200());
        }
        scheduledExecutorService.schedule(new RunnableImpl200(),3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
//        ---------------------------AtFixedRate---------------------------
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(),3,1,TimeUnit.SECONDS);
//        Thread.sleep(20000);
//        scheduledExecutorService.shutdown();
//        ---------------------------WithFixedDelay------------------------
//        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(),3,1,TimeUnit.SECONDS);
//          -------------------------CachedThreadPool----------------------
//        ExecutorService executorService = Executors.newCachedThreadPool();

    }

}

class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
