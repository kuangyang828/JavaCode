package oopexer2;

public class Account {
    private double balance;

    public Account(double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //存钱操作
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存钱成功");
        }
    }

    //取钱操作
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("取款失败，余额不足");
        }else {
            balance -= amount;
            System.out.println("取款成功");
        }
    }

}
