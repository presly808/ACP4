package ua.artcode.week4.th;

/**
 * Created by serhii on 07.02.15.
 */
public class RecThread implements Runnable {

    private int limit;

    private int deep;

    private String spaces;

    public RecThread(int limit, int deep, String spaces) {
        this.limit = limit;
        this.deep = deep;
        this.spaces = spaces;
    }

    @Override
    public void run() {
        if(deep < limit){
            new Thread(new RecThread(limit, deep + 1, spaces + " ")).start();
        }

        for(;;){
            System.out.println(spaces + (int)(Math.random() * 10));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
