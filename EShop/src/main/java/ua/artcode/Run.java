package ua.artcode;

import ua.artcode.dao.UserDaoImpl;
import ua.artcode.service.UserServiceImpl;
import ua.artcode.view.Menu;

import java.util.Scanner;

/**
 * Created by serhii on 28.02.15.
 */
public class Run {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(
                        new UserServiceImpl(
                            new UserDaoImpl()));

        while(true){
            System.out.println("Choose action");
            menu.printMenu();
            int ch = sc.nextInt();
            menu.doChoice(ch);
        }
    }
}
