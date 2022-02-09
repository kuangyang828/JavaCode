package oopexer4;

import java.util.Objects;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
//        this.color = "white";
//        this.weight = 1.0;
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算圆的面积
    public double findArea() {
        return Math.PI * radius * radius;
    }

    //比较两个圆的半径是否相等。
    //如相等，返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Circle) {
            Circle circle = (Circle) o;
            return this.radius == circle.radius;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
