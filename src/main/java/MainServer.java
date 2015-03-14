import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

/**
 * Created by serhii on 06.03.15.
 */
public class MainServer {

    static List<PrintWriter> connections = Collections.synchronizedList(new ArrayList<PrintWriter>());
    static List<Socket> sockets = Collections.synchronizedList(new ArrayList<Socket>());

    //start program
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);

        // wait for client always
        System.out.println("SERVER start");
        while(true){
            final Socket client = ss.accept();
            sockets.add(client);
            System.out.println("new client");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Scanner sc = new Scanner(client.getInputStream());
                        while(true){
                            String message = sc.nextLine(); // read from client
                            System.out.println("Client send " + message);
                            for(PrintWriter pw : connections){
                                pw.println(message); // send to others
                                pw.flush();
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();


            PrintWriter pw = new PrintWriter(client.getOutputStream());
            connections.add(pw);

            String x = "Hello from server your ip " +
                    client.getInetAddress() +
                    " time " + new Date();
            pw.println(x);
            pw.flush();
        }


    }


}
