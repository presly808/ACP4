package ua.artcode.week4.th;

/**
 *
 */
public class TestThreadStates {


    public static void main(String[] args) throws InterruptedException {
        Thread th =
            new Thread(new MyThreadRunn());
        System.out.println(th.getState());
        th.start();
        System.out.println(th.getState());

        while(th.getState() != Thread.State.TERMINATED){
            System.out.println(th.getState());
            Thread.sleep(200);
        }

        System.out.println(th.getState());

    }


}
