package exer.collection.treesetexer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的5个对象，并把这些对象放入TreeSet集合中（下一章：TreeSet需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 * 1).使Employee实现Comparable接口，并按name排序
 * 2).创建TreeSet时传入Comparator对象，按生日日期的先后排序。
 */

public class EmployeeTest {

    /**
     * 问题二：使用定制排序
     * 按生日日期的先后排序。
     */
    @Test
    public void test2(){
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee){
                    Employee employee1 = (Employee) o1;
                    Employee employee2 = (Employee) o2;

                    MyDate myDate1 = employee1.getBirthday();
                    MyDate myDate2 = employee2.getBirthday();

                    //按生日日期的先后排序
                    //比较年
                    int minusYear = myDate1.getYear() - myDate2.getYear();
                    if (minusYear !=0){
                        return minusYear;
                    }
                    //比较月
                    int minusMonth = myDate1.getMonth() - myDate2.getMonth();
                    if (minusMonth !=0){
                        return minusMonth;
                    }
                    //比较日
                    return myDate1.getDay() - myDate2.getDay();
                }
                throw new RuntimeException("传入的数据类型不一致");
            }
        });

        Employee e1 = new Employee("liudehua", 50, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liangchaowei", 21, new MyDate(1978, 12, 4));

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 问题一：使用自然排序
     */
    @Test
    public void test1() {
        TreeSet treeSet = new TreeSet();

        Employee e1 = new Employee("liudehua", 50, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liangchaowei", 21, new MyDate(1978, 12, 4));

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);

        for (Object employee:treeSet) {
            System.out.println(employee);
        }

//        Iterator iterator = treeSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
