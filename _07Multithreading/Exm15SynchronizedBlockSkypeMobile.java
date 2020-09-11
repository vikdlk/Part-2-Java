package _07Multithreading;

public class Exm15SynchronizedBlockSkypeMobile {
    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call and");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call and");
        }
    }

    void whatsAppCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call start");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsApp call and");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Mobile());
        Thread thread2 = new Thread(new Skype());
        Thread thread3 = new Thread(new WhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Mobile implements Runnable {

    @Override
    public void run() {
        new Exm15SynchronizedBlockSkypeMobile().mobileCall();
    }
}

class Skype implements Runnable {

    @Override
    public void run() {
        new Exm15SynchronizedBlockSkypeMobile().skypeCall();
    }
}

class WhatsApp implements Runnable {

    @Override
    public void run() {
        new Exm15SynchronizedBlockSkypeMobile().whatsAppCall();
    }
}

