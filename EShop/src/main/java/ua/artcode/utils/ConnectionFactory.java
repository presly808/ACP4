package ua.artcode.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by serhii on 22.02.15.
 */
public class ConnectionFactory {

    //get from property
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/eshop";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private ConnectionFactory(){}


    public static Connection getConnection(){

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
