package implementsThread;

import static java.lang.Thread.currentThread;

//If the class implements the Runnable interface, the thread can be run by passing
// an instance of the class to a Thread object's constructor and then calling the thread's start() method:
public class Main implements Runnable {
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread1 = new Thread(obj);
        thread1.start();
        Thread thread2 = new Thread(obj);
        thread2.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread. Thread id: "+currentThread().getId());
    }

}

