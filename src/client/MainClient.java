package client;

import java.net.Socket;

public class MainClient extends Thread {
    String ip = "localhost";
    int port = 7777;

    public static void main(String[] args) {
        new MainClient().start();
    }

    @Override
    public void run() {
        super.run();
        try {
            Socket s = new Socket(ip, port);
            ClientThread clientThread = new ClientThread(s);
            clientThread.start();
        } catch (Exception e) {
            System.out.println("[ERROR]" + e.getMessage());
        }
    }
}