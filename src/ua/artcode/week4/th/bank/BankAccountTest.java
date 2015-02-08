package ua.artcode.week4.th.bank;

/**
 * Created by serhii on 07.02.15.
 */
public class BankAccountTest {

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

    public synchronized void deposit(int money){
        System.out.println(Thread.currentThread().getName() + " begin synch deposit money " + cash);
        while(cash != 0){
            try {
                System.out.println(Thread.currentThread().getName() + " go to sleep deposit money " + cash);
                wait();//WAITING
                System.out.println(Thread.currentThread().getName() + " awake deposit money " + cash);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cash = cash + money;
        System.out.println(Thread.currentThread().getName() + " end synch deposit money " + cash);
        notifyAll();
    }

    public int withdraw(int money){
        System.out.println(Thread.currentThread().getName() + " begin withdraw deposit money " + cash);
        synchronized (this){
            while(cash == 0){
                try {
                    System.out.println(Thread.currentThread().getName() + " go to sleep withdraw deposit money " + cash);
                    wait();
                    System.out.println(Thread.currentThread().getName() + " awake withdraw deposit money " + cash);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            cash = cash - money;
            System.out.println(Thread.currentThread().getName() + " end withdraw deposit money " + cash);
            notifyAll();
            return money;
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
