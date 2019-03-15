package com.wcq.template;

import com.wcq.template.Entity.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 方式一，用继承抽象类的方式
 */
public class UserDao extends JDBCTemplate {
    public UserDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public List<User> getResult(ResultSet resultSet) throws SQLException {
        List<User> userList = new ArrayList<>();
        while(resultSet.next()){
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setPassword(resultSet.getString("password"));
            userList.add(user);
        }
        return userList;
    }
}

/**
 * 方式二，用静态代理的方式 持有被代理对象 进行一系列操作
  */
//public class UserDao {
//    private JDBCTemplate jdbcTemplate;
//    public UserDao(JDBCTemplate jdbcTemplate){
//        this.jdbcTemplate=jdbcTemplate;
//    }
//
//    public void execute() throws Exception {
//        jdbcTemplate.execute();
//    }
//
//    public List<User> getResult(ResultSet resultSet) throws SQLException {
//        List<User> userList = new ArrayList<>();
//        while(resultSet.next()){
//            User user = new User();
//            user.setId(resultSet.getInt("id"));
//            user.setName(resultSet.getString("name"));
//            user.setPassword(resultSet.getString("password"));
//            userList.add(user);
//        }
//        return userList;
//    }
//}
