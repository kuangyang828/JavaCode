package exer.oopexer4;

/**
 * 写一个测试类，创建两个Circle对象，判断其颜色是否相等；
 * 利用equals方法判断其半径是否相等；
 * 利用toString()方法输出其半径。
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle("white",2.0,2.3);
        //判断其颜色是否相等；
        System.out.println("判断其颜色是否相等:"+circle1.getColor().equals(circle2.getColor()));
        //利用equals方法判断其半径是否相等
        System.out.println("利用equals方法判断其半径是否相等:"+circle1.equals(circle2));
        //利用toString()方法输出其半径
        System.out.println(circle1);
        System.out.println(circle2.toString());
    }
}
