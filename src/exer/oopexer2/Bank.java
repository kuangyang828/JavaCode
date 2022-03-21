package exer.oopexer2;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        customers = new Customer[10];   //在构建时new新数组，否则会报空指针错误
    }

    //添加客户
    public void addCuatomer(String f,String l){
                Customer cust = new Customer(f,l);
                customers[numberOfCustomer++] = cust;
    }

    //获取客户的个数
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }

    public Customer getCustomer(int index){
        return customers[index];
    }
}
