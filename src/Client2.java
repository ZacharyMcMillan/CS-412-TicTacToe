import java.io.IOException;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) {
        Controller MVC = new Controller();
        connect();
    }

    public static void connect() {
        try {
            System.out.println("CLIENT2> connecting to 127.0.0.1:5000");
            Socket socket = new Socket("127.0.0.1", 5000);
            System.out.println("CLIENT2> success!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
