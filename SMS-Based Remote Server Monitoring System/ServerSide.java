import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ServerSide {
    private ServerSocket server;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner scanner;

    public ServerSide(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started at port " + port);
            System.out.println("Waiting for a client...");
            socket = server.accept();
            System.out.println("Client accepted");

            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            out = new DataOutputStream(socket.getOutputStream());
            scanner = new Scanner(System.in);

            String line = "";
            while (!line.equals("Over")) {
                try {
                    line = in.readUTF();
                    System.out.println("Client: " + line);

                    System.out.print("Server: ");
                    String message = scanner.nextLine();
                    // send input to client
                    out.writeUTF(message);
                    out.flush();
                } catch (IOException i) {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");

            socket.close();
            in.close();
            out.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ServerSide server = new ServerSide(5100);
    }
}