package ua.artcode.model;

/**
 * Created by serhii on 22.02.15.
 */
public class Client {

    private int id;
    private String name;
    private String email;
    private String phone;

    private String login;
    private String pass;

    public Client() {
    }

    public Client(String name, String email,
                  String phone, String login,
                  String pass) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.pass = pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
