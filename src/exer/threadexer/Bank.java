package exer.threadexer;

class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void addBanlance(double num) {
        balance += num;
    }
}

class Customer implements Runnable {

    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 3; i++) {
            account.addBanlance(1000);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":存钱，余额为" + account.balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Account act = new Account(0);
        Customer c = new Customer(act);

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.setName("储户1");
        t2.setName("储户2");

        t1.start();
        t2.start();

    }

}
