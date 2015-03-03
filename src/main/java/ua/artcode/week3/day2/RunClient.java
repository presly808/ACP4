package ua.artcode.week3.day2;

/**
 * Created by serhii on 01.02.15.
 */
public class RunClient {

    public static void main(String[] args) {
        //192.168.1.40
        // localhost or 127.0.0.1
        ClientSocket clientSocket = new ClientSocket("192.168.1.40",9090);
        clientSocket.start();
    }

}
