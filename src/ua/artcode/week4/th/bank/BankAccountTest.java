package ua.artcode.week4.th.bank;

/**
 * Created by serhii on 07.02.15.
 */
public class BankAccountTest {

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount("123456789", 0);

        for(int i = 0; i < 5; i++){
            Thread thread = new Thread(new DepositThread(account, 1000));
            thread.start();
        }

        Thread.sleep(3000);


        System.out.println(account.getCash());
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
        cash = cash + money;
    }

    public int withdraw(int money){
        cash = cash - money;
        return money;
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
