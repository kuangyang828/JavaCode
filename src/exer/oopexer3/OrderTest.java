package exer.oopexer3;

/**
 * 编写Order类，有int型的orderld， String型的orderName，
 * 相应的getterQ和setterQ方法，
 * 两个参数的构造器，
 * 重写父类的equals(方法：
 * public boolean equals(Object obj）)，
 * 并判断测试类中创建的两个对象是否相等。  (一般重写比较是否相等，都是比内容是否相等)
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"AA");
        Order order2 = new Order(1001,"BB");
        System.out.println(order1.equals(order2));

        Order order3 = new Order(1001,"BB");
        System.out.println(order3.equals(order2));

    }
}

class Order{
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o instanceof Order){
            Order order = (Order) o;

            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
            //错误的
            // ==比的是地址值。
            // 这里是看内容等不等，所以String类型要用equals
            //return this.orderId == order.orderId && this.orderName == order.orderName);
        }

        return false;
    }

}
