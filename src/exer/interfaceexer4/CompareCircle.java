package exer.interfaceexer4;

public class CompareCircle extends Circle implements CompareObject{

    public CompareCircle() {
        super();
    }

    public CompareCircle(double redius) {
        super(redius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof Circle){
            Circle c = (Circle) o;
            if (this.getRedius() > c.getRedius()){
                return 1;
            }else if (this.getRedius() < c.getRedius()){
                return -1;
            }else {
                return 0;
            }
        }
//        return 0;
        throw new RuntimeException("传入的数据类型不匹配");
    }
}
