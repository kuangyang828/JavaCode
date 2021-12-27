package oop;

/**
 * 4. 对象数组题目：
 * 定义类Student， 包含三个属性：学号number(int)，年级state(int)，score(int).
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1)生成随机数：Math.random0，返回值类型double:
 * 2)四含五八取整：Math.roundldouble d)：返回值类型long：
 */

public class StudentTest {
    public static void main(String[] args) {

        //声明Studwnt类型数组
        Student stus[] = new Student[20];
        for (int i = 0; i < stus.length; i++) {
            //给数组元素赋值
            stus[i] = new Student();

            //给Student对象的属性赋值
            //学号
            stus[i].number = (i + 1);
            //年级 [1,6]
            stus[i].state = (int) (Math.random() * 5 + 1);
            //成绩 [0,100]
            stus[i].score = (int) (Math.random() * 100);
        }

        //遍历学生数组
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }

        System.out.println("**************************");

        //问题一：打印出3年级(state值为3）的学生信息
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3) {
                System.out.println(stus[i].info());
            }
        }

        System.out.println("**************************");

        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < stus.length; i++) {
            for (int j = 0; j < stus.length - i - 1; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    //注意交换的是数组元素，不是成绩
                    Student temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }

        //遍历学生数组
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }

    }
}

class Student {
    //属性
    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息
    public String info() {
        return "学号：" + number + "，年级：" + state + "，成绩：" + score;
    }
}
