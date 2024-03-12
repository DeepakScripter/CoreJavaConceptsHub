import java.net.InetAddress; // Importing InetAddress class for working with IP addresses and hostnames
import java.net.UnknownHostException; // Importing UnknownHostException for handling hostname resolution errors

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // Get the local host's InetAddress
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Hostname: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());

            // Get InetAddress by hostname
            String hostname = "www.example.com";
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("IP Address for " + hostname + ": " + address.getHostAddress());

            // Get all IP addresses associated with a hostname (if multiple)
            InetAddress[] addresses = InetAddress.getAllByName(hostname);
            System.out.println("All IP Addresses for " + hostname + ":");
            for (InetAddress addr : addresses) {
                System.out.println(addr.getHostAddress());
            }

        } catch (UnknownHostException e) {
            // Handle the exception if hostname resolution fails
            e.printStackTrace();
        }
    }
}
