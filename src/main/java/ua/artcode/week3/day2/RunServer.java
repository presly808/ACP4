package ua.artcode.week3.day2;

/**
 * Created by serhii on 01.02.15.
 */
public class RunServer {
    public static void main(String[] args) {
        //192.168.1.40 9090
        MyServerSocket serverSocket = new MyServerSocket();
        serverSocket.start();
    }




}
