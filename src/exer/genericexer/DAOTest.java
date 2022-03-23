package exer.genericexer;


import org.junit.Test;

import java.util.List;

/**
 * 定义一个测试类：
 * 创建DAO类的对象，分别调用其save、get、update、list、delete方法来操作User对象，
 * 使用Junit单元测试类进行测试。
 */

public class DAOTest {

    @Test
    public void test() {
        DAO<User> dao = new DAO<>();

        dao.save("1001", new User(1001, 35, "周杰伦"));
        dao.save("1002", new User(1002, 30, "汪峰"));
        dao.save("1003", new User(1003, 25, "五月天"));

        dao.update("1003", new User(1003, 30, "阿信"));

        dao.delete("1002");

        List<User> list = dao.list();
//        System.out.println(list);
        list.forEach(System.out::println);
    }
}
