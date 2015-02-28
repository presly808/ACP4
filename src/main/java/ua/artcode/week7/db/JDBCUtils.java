package ua.artcode.week7.db;

import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by serhii on 28.02.15.
 */
public class JDBCUtils {

    public static void main(String[] args) {
        transaction();
    }

    public static void transaction() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet= null;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            connection.setAutoCommit(false);
            statement.execute(
                    String.format("INSERT INTO ADDRESSES (city,street,num) VALUES ('%s','%s',%d)", "Kharkiv", "Svobody", 45));
            resultSet = statement.executeQuery(String.format("SELECT id FROM ADDRESSES WHERE num=%d ORDER BY id DESC LIMIT 1",45));
            if(resultSet.next()){
                int addId = resultSet.getInt("id");
                statement.execute(String.format("INSERT INTO USERS (name,add_id) VALUES ('%s',%d)", "Kolia", addId));
            }
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }







}
