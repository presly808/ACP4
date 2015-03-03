package ua.artcode.week4.th;

/**
 * 1. extends Thread or impl Runnable
 * 2. Create instance
 * 3. invoke method start
 */
public class MyThread extends Thread {

    //separate logic from other thread
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread1 -" + i);
        }

    }
}
