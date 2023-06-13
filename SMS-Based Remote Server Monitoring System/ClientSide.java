import java.net.*;
import java.io.*;
import javax.swing.*;

public class ClientSide extends JFrame {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
    private JTextArea messageArea = new JTextArea(10, 30);
    private JTextField messageField = new JTextField(30);
    private JButton sendButton = new JButton("Send");

    public ClientSide(String address, int port) {
        super("Client");
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(messageArea));
        panel.add(messageField);
        panel.add(sendButton);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);

        // establish a connection
        try {
            socket = new Socket(address, port);
            messageArea.append("Connected\n");
            input = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            messageArea.append(u.toString());
        } catch (IOException i) {
            messageArea.append(i.toString());
        }

        // send button listener
        sendButton.addActionListener(e -> {
            String message = messageField.getText();
            if (message.trim().length() == 0) {
                return;
            }
            try {
                out.writeUTF(message);
                messageArea.append("Client: " + message + "\n");
                messageField.setText("");
                messageArea.setCaretPosition(messageArea.getDocument().getLength()); // add this line
            } catch (IOException i) {
                messageArea.append(i.toString());
            }
        });

        // read messages from server
        Thread readThread = new Thread(() -> {
            String line;
            while (true) {
                try {
                    line = input.readUTF();
                    messageArea.append("Server: " + line + "\n");
                    messageArea.setCaretPosition(messageArea.getDocument().getLength()); // add this line
                } catch (IOException i) {
                    messageArea.append(i.toString());
                    break;
                }
            }
        });
        readThread.start();
    }

    public static void main(String args[]) {
        ClientSide client = new ClientSide("localhost", 5100);
    }
}