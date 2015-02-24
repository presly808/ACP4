package ua.artcode.service;

import ua.artcode.model.Client;

/**
 * Created by serhii on 22.02.15.
 */
public interface UserService {

    void register(String login, String pass, String email);

    String signIn(String login, String pass);

    Client getInfo(String login);

}
