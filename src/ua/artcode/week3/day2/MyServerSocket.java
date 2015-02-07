package ua.artcode.week3.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by serhii on 01.02.15.
 */
public class MyServerSocket {

    private int count = 0;

    public void start(){
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            while(true) {
                Socket client = serverSocket.accept();
                System.out.printf("%d cent = %s\n", count, client.getRemoteSocketAddress().toString());

                //get Input read from server
                // write to
                PrintWriter pw = new PrintWriter(client.getOutputStream());

                pw.printf("hello from server %s, your num %d, current date = %tc\n",
                        serverSocket.getInetAddress(), count++, new Date());

                pw.flush();
                pw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
