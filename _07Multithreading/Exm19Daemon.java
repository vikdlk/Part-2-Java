package _07Multithreading;

public class Exm19Daemon {
    public static void main(String[] args) {
        System.out.println("Main Thread start");
        UserThread userThread = new UserThread();
        userThread.setName("user_Thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_Thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();

        System.out.println("Main Thread end");
    }

}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon: " + isDaemon());

        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon: " + isDaemon());

        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
