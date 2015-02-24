package ua.artcode.week6.db;

import java.sql.*;

/**
 * Created by serhii on 22.02.15.
 */
public class TestJDBC {

    public static final String URL = "jdbc:mysql://127.0.0.1:3306/ACP4";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); //load driver

        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM ADDRESSES;");
        while(resultSet.next()){
            System.out.printf("id:%d, city:%s, street:%s\n",
                    resultSet.getInt("id"),
                    resultSet.getString("city"),
                    resultSet.getString("street"));
        }
        connection.close();


    }
}
