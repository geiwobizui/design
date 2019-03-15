package com.wcq.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class JDBCTemplate {
    private DataSource dataSource;
    public JDBCTemplate(DataSource dataSource){
        this.dataSource=dataSource;
    }
    private Connection getConnection() throws SQLException {
        //1、创建连接
        return dataSource.getConnection();
    }
    private Statement getStatement(Connection connection) throws SQLException {
        return connection.createStatement();
    }
    private ResultSet getResultSet(Statement statement,String sql) throws SQLException {
        return statement.executeQuery(sql);
    }
    private void closeResultSet(ResultSet resultSet) throws SQLException {
        if(resultSet!=null){
            resultSet.close();
        }
    }
    private void closeStatement(Statement statement) throws SQLException {
        if(statement!=null){
            statement.close();
        }
    }
    private void closeConnection(Connection connection) throws SQLException {
        if(connection!=null){
            connection.close();
        }
    }

    public void execute() throws Exception{
        //1、创建连接
        Connection connection = getConnection();
        //2、创建数据库操作对象
        Statement statement = getStatement(connection);
        //3、定义SQL
        String sql = "select * from user";
        //4、执行sql
        ResultSet resultSet = getResultSet(statement,sql);
        //5、操作结果集
        getResult(resultSet);
//        List<User> userList = new ArrayList<>();
//        while(resultSet.next()){
//            User user = new User();
//            user.setId(resultSet.getInt("id"));
//            user.setName(resultSet.getString("name"));
//            user.setPassword(resultSet.getString("password"));
//            userList.add(user);
//        }
        //6、关闭结果集对象
        closeResultSet(resultSet);
        //7、关闭数据库操作对象
        closeStatement(statement);
        //8、关闭连接
        closeConnection(connection);
    }

    public abstract Object getResult(ResultSet resultSet) throws SQLException;
//    public abstract void getA();
}
