package exer.interfaceexer4;

public class InterfaceTest {
    public static void main(String[] args) {
        CompareCircle c1 = new CompareCircle();
        CompareCircle c2 = new CompareCircle();
        c1.setRedius(10);
        c2.setRedius(20);
        System.out.println(c1.compareTo(c2));
        System.out.println();

        CompareCircle c3 = new CompareCircle(16.6);
        CompareCircle c4 = new CompareCircle(12.2);
        System.out.println(c3.compareTo(c4));

        System.out.println( c3.compareTo(new String("AAA")));

    }
}
