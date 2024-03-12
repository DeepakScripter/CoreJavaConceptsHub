import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) {
        try {
            // Create a server socket that listens on port 8080
            ServerSocket serverSocket = new ServerSocket(8080);

            System.out.println("Server is waiting for client to connect...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();

            System.out.println("Client connected!");

            // Get input and output streams for communication with the client
            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();

            // Read data from the client
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String clientData = new String(buffer, 0, bytesRead);
            System.out.println("Received from client: " + clientData);

            // Send a response back to the client
            String response = "Hello from the server!";
            outputStream.write(response.getBytes());

            // Close the sockets
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
