package javaCore.async_dev;

/**
 * Created by ASUS on 5/30/2017.
 */

class PrintDemo {
    public void printCount() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Counter   ---   " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo pd;

    ThreadDemo(String name, PrintDemo pd) {
        threadName = name;
        this.pd = pd;
    }

    public void run(){
        pd.printCount();
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        PrintDemo pd = new PrintDemo();

        ThreadDemo t1 = new ThreadDemo("Thread - 1", pd);
        ThreadDemo t2 = new ThreadDemo("Thread - 2", pd);

        t1.start();
        t2.start();

        //wait for threads to end
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
