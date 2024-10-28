package com.atguigu01.selfdefine.exer1;

import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.save("1001",new User(1,33,"ÖÜ½ÜÂ×"));
        dao.save("1002",new User(2,32,"À¥Áè"));


        dao.update("1002",new User(2,32,"sss"));
        dao.delete("1002");
        List<User> ls = dao.list();
        for(User s:ls){
            System.out.println(s);
        }

    }
}
