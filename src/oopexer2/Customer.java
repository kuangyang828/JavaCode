package oopexer2;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
}
