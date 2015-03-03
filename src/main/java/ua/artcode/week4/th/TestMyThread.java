package ua.artcode.week4.th;

/**
 * Created by serhii on 07.02.15.
 */
public class TestMyThread {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("MainThread -" + i);
        }
    }
}
