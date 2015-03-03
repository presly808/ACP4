package ua.artcode.week4.th;

/**
 * Created by serhii on 07.02.15.
 */
public class TestRecThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(new RecThread(10, 0, ""));
        th.setDaemon(true);
        th.start();

        Thread.sleep(2000);


    }

}
