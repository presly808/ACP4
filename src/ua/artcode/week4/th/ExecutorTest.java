package ua.artcode.week4.th;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by serhii on 07.02.15.
 */
public class ExecutorTest {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        Future future = es.submit(new TaskThread());

        Object res = future.get();
        System.out.println(res);
        es.shutdown();

    }
}


class TaskThread implements Callable {

    @Override
    public Object call() throws Exception {
        int res = 0;
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (int i = 0; i < input.size(); i++) {
            res += input.get(i);
        }
        return res;
    }
}



