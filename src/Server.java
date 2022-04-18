import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("SERVER> waiting for player(s) to connect");

            Socket player1 = serverSocket.accept();
            System.out.println("SERVER> player1 connected");
            BufferedReader player1BR = new BufferedReader(new InputStreamReader(player1.getInputStream()));
            PrintWriter player1PW = new PrintWriter(player1.getOutputStream());
            player1PW.println(1);

            Socket player2 = serverSocket.accept();
            System.out.println("SERVER> player2 connected");
            BufferedReader player2BR = new BufferedReader(new InputStreamReader(player2.getInputStream()));
            PrintWriter player2PW = new PrintWriter(player2.getOutputStream());
            player2PW.println(2);

            System.out.println("SERVER> game starting...");

            while (!checkWinCondition()) {

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static boolean checkWinCondition() {
        return false;
    }
}
