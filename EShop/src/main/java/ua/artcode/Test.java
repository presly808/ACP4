package ua.artcode;

import ua.artcode.dao.UserDAO;
import ua.artcode.dao.UserDaoImpl;
import ua.artcode.model.Client;
import ua.artcode.service.UserService;
import ua.artcode.service.UserServiceImpl;

/**
 * Created by serhii on 22.02.15.
 */
public class Test {


    public static void main(String[] args) {
        UserDAO dao = new UserDaoImpl();
        UserService userService = new UserServiceImpl(dao);



        userService.register("Oleg","1234", "asda@kk.com");


    }

}
