package ua.artcode.view;

import ua.artcode.exception.ApplicationException;
import ua.artcode.model.Client;
import ua.artcode.service.UserService;

import java.util.Scanner;

/**
 * Created by serhii on 28.02.15.
 */
public class Menu {

    private Scanner sc = new Scanner(System.in);
    private UserService userService;

    public Menu(UserService userService) {
        this.userService = userService;
    }

    public void printMenu(){
        System.out.println("1.register");
        System.out.println("2.find");
        System.out.println("0.exit");
    }


    public void doChoice(int choice){
        switch (choice) {

            case 1 : {
                System.out.println("Input login");
                String login = sc.nextLine();
                System.out.println("Input pass");
                String pass = sc.nextLine();
                System.out.println("Input email");
                String mail = sc.nextLine();

                userService.register(login, pass, mail);
                break;
            }
            case 2 : {
                System.out.println("Input login");
                String login = sc.nextLine();
                try {
                    Client client = userService.getInfo(login);
                    System.out.println(client);
                } catch (ApplicationException e) {
                    System.err.println(e.getMessage());
                }
                break;
            }

            case 0 : {
                System.exit(1);
                break;
            }


        }


    }







}
