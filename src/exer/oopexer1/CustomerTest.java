package exer.oopexer1;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);

        customer.setAccount(account);

        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        //System.out.println(customer);
        System.out.println("Customer ["+customer.getLastName()+"，"+customer.getFirstName()+"] has a account: id is "+customer.getAccount().getId()+"，annuallnterestRate is "+customer.getAccount().getAnnuallnterestRate()*100+"%，balance is "+customer.getAccount().getBalance());

    }
}
