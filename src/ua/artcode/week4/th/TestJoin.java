package ua.artcode.week4.th;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by serhii on 07.02.15.
 */
public class TestJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(new MyThreadRunn());
        th.start();


        th.join();

        System.out.println("report some after threads");
    }

}
