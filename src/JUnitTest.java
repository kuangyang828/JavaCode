import org.junit.Test;

public class JUnitTest {
    @Test
    public void test1(){
        Integer in1 = new Integer(12);
        System.out.println(in1.toString()+1);
        int i = in1.intValue() + 1;
        System.out.println(i);
    }

}
