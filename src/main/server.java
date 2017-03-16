package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by egorov on 16.03.2017.
 */
public class server {
    public static void main(String[] args){
        initWindow();
    }
    private static void initWindow() {
        try {
            ServerSocket server = new ServerSocket(5000);
            // TODO: 03.03.2017 Либо мы пингуем постоянно что бы знать подключен ли чувак либо при отправке сообщения
            while (true){
                Socket socket = server.accept();
                PrintWriter writer = (new PrintWriter(socket.getOutputStream()));
                writer.println("Cliend accept" );
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
