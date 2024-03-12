import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {

    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server on localhost and port 8080
            Socket socket = new Socket("localhost", 8080);

            // Get input and output streams for communication with the server
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            // Send data to the server
            String message = "Hello from the client!";
            outputStream.write(message.getBytes());

            // Read the response from the server
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String serverResponse = new String(buffer, 0, bytesRead);
            System.out.println("Server says: " + serverResponse);

            // Close the socket
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
