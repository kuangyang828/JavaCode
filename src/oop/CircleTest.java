package oop;

import java.util.Scanner;

/**
 * 2.利用面向对象的编程方法，设计类Circle计t算圆的面积。
 */

//测试类
public class CircleTest {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");

        Scanner scanner = new Scanner(System.in);
        double radius1 = scanner.nextDouble();

        Circle c = new Circle();
        c.radius = radius1;
        System.out.println("圆的面积是"+c.findArea());
    }

}

//圆
class Circle {
    //属性
    double radius;

    //求圆的面积
    public double findArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

}
