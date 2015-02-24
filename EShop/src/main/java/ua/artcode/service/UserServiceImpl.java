package ua.artcode.service;

import ua.artcode.dao.UserDAO;
import ua.artcode.model.Client;

/**
 * Created by serhii on 22.02.15.
 */
public class UserServiceImpl implements  UserService {

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void register(String login, String pass, String email) {
        //validation

        //construct
        Client client = new Client(login, email, null, login, pass);

        userDAO.create(client);
    }

    @Override
    public String signIn(String login, String pass) {
        return null;
    }

    @Override
    public Client getInfo(String login) {
        return null;
    }
}
