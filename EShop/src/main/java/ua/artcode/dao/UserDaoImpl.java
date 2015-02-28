package ua.artcode.dao;

import ua.artcode.exception.ApplicationException;
import ua.artcode.exception.NoUserFoundException;
import ua.artcode.model.Client;
import ua.artcode.utils.ConnectionFactory;

import java.sql.*;
import java.util.List;

/**
 * Created by serhii on 22.02.15.
 */
public class UserDaoImpl implements UserDAO {



    @Override
    public void create(Client client) {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO clients(name,login,pass,email,phone) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getLogin());
            preparedStatement.setString(3, client.getPass());
            preparedStatement.setString(4, client.getEmail());
            preparedStatement.setString(5, client.getPhone());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Client client) {

    }

    @Override
    public Client findOne(int id) {

        return null;
    }

    @Override
    public Client findOne(String login) throws ApplicationException {
        Client client = null;
        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement()){

            String sql = String.format(
                    "SELECT id,name,login,email,phone FROM clients WHERE login='%s'", login);

            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                client = new Client();
                client.setId(rs.getInt("id"));
                client.setName(rs.getString("name"));
                client.setLogin(rs.getString("login"));
                client.setEmail(rs.getString("email"));
                client.setPhone(rs.getString("phone"));
            } else {
                throw new NoUserFoundException("user with login " + login + " not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }
}
