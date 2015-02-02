package ua.artcode.week3.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by serhii on 01.02.15.
 */
public class ClientSocket {

    private String ipAddress;
    private int port;

    public ClientSocket() {
    }

    public ClientSocket(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public void start(){
        try {
            Socket socket = new Socket(ipAddress, port);

            BufferedReader bufferedReader = new BufferedReader(
                                                new InputStreamReader(
                                                        socket.getInputStream()));
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
