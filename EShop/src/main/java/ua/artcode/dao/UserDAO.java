package ua.artcode.dao;

import ua.artcode.model.Client;

import java.util.List;

/**
 * CRUD - CREATE READ UPDATE DELETE
 */
public interface UserDAO {

    void create(Client client);

    void delete(Client client);

    Client findOne(int id);

    Client findOne(String login);

    List<Client> findAll();


}
