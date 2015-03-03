package ua.artcode.week4.th;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by serhii on 07.02.15.
 */
public class BankAccountLockTest {

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount("123456789", 0);

        for(int i = 0; i < 5; i++){
            Thread thread1 = new Thread(new DepositThread(account, 1000));
            thread1.start();
            Thread thread2 = new Thread(new WithdrawThread(account, 1000));
            thread2.start();
        }


    }
}

class BankAccount {

    private Lock monitor = new ReentrantLock(true);
    private Condition depositCondition = monitor.newCondition();
    private Condition withdrawCondition = monitor.newCondition();
    private String number;
    private int cash;

    public BankAccount(String number, int cash) {
        this.number = number;
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public String getNumber() {
        return number;
    }

    public void deposit(int money){
        monitor.lock();
        try {

            System.out.println(Thread.currentThread().getName() + " begin synch deposit money " + cash);

            while(cash == 0){
                try {
                    System.out.println(Thread.currentThread().getName() + " wait synch deposit money " + cash);
                    depositCondition.await();
                    System.out.println(Thread.currentThread().getName() + " awake synch deposit money " + cash);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            cash = cash + money;
            System.out.println(Thread.currentThread().getName() + " end synch deposit money " + cash);
            withdrawCondition.signal();
        } finally {
            monitor.unlock();
        }
    }

    public int withdraw(int money){
        monitor.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " begin withdraw money " + cash);
            while(cash == 0){
                try {
                    System.out.println(Thread.currentThread().getName() + " wait synch withdraw money " + cash);
                    withdrawCondition.await();
                    System.out.println(Thread.currentThread().getName() + " wait synch withdraw money " + cash);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            cash = cash - money;
            System.out.println(Thread.currentThread().getName() + " end withdraw withdraw money " + cash);
            depositCondition.signal();
            return money;
        } finally {
            monitor.unlock();
        }
    }
}

class DepositThread implements Runnable {

    private BankAccount account;
    private int actionsCount;

    public DepositThread(BankAccount account, int actionsCount) {
        this.account = account;
        this.actionsCount = actionsCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < actionsCount; i++) {
            account.deposit(1);
        }
    }

}

class WithdrawThread implements Runnable {

    private BankAccount account;
    private int actionsCount;

    public WithdrawThread(BankAccount account, int actionsCount) {
        this.account = account;
        this.actionsCount = actionsCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < actionsCount; i++) {
            account.withdraw(1);
        }
    }
}

