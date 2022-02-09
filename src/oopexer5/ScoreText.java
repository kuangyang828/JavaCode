package oopexer5;

import java.util.Scanner;
import java.util.Vector;

public class ScoreText {
    public static void main(String[] args) {
        //1.实例化Scanner，用于从键盘获取学生成绩
        Scanner scanner = new Scanner(System.in);

        //2.创建Vector对家：Vector v=new Vector()；相当于原来的数组
        Vector vector = new Vector();

        int maxScore = 0;

        //3.通过for（;;)或while(true)方式，给Vector中添加数组
        for (; ; ) {

            System.out.print("请输入学生成绩（以负数代表结束）：");
            int score = scanner.nextInt();

            //3.2 当输入是负数时，跳出循环
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("输入的数据非法，请重新输入");
                continue;
            }

            //3.1添加操作：v.addElement (object obj)
            vector.addElement(score);//自动装箱及多态

            //4.获取学生成绩的最大值
            if (maxScore < score) {
                maxScore = score;
            }
        }

        char level;
        //5.遍历Vector，得到每个学生的成绩，并与最大值比较，得到每个学生的成绩
        for (int i = 0; i < vector.size(); i++) {
            Object o = vector.elementAt(i);
            int score = (int) o;//自动拆箱
            if (maxScore - score <= 10) {                                                                                                
                level = 'A';
            } else if (maxScore - score <= 20) {
                level = 'B';
            } else if (maxScore - score <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student-" + (i+1) + " score is " + score + " level is " + level);

        }

    }
}
