package exer.oopexer3;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("ml!=m2"); // m1 != m2
        }
        if (m1.equals(m2)) {
            System.out.println("ml is equal to m2");// ml is equal to m2
        } else {
            System.out.println("ml is not equal to m2");
        }
    }
}

class MyDate{
    private int day;
    private  int month;
    private  int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o instanceof MyDate){
            MyDate myDate = (MyDate) o;
            return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
        }

        return false;
    }

    /**
     * 自动的
     */

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyDate myDate = (MyDate) o;
//        return day == myDate.day && month == myDate.month && year == myDate.year;
//    }

}
