package exer.oopexer6;

import java.util.Calendar;

public class PayrollSystem {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        //System.out.println(month);//一月份，0

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("张三", 1001, new MyDate(1991, 2, 1), 20000);
        emps[1] = new HourlyEmployee("李四", 1002, new MyDate(1992, 3, 1), 80, 240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为：" + salary);
            if ((++month) == emps[i].getBirthday().getMonth()) {
                System.out.println("生日快乐！奖励100元");
            }
        }

    }
}
