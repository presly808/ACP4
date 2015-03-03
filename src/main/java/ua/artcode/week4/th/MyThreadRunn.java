package ua.artcode.week4.th;

/**
 * 1. extends Thread or impl Runnable
 * 2. Create instance
 * 3. invoke method start
 */
public class MyThreadRunn implements Runnable {

    //separate logic from other thread
    @Override
    public void run() {
        Thread curr = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(curr.getId() + ", " +
                    curr.getName() + ", " +
                    curr.getPriority() + ", " + i);
            try {
                Thread.sleep(500); // TIMED_WAITING
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
