// Interface defining camera-related functionalities
interface MyCamera {
    void takeSnap(); // Abstract method to take a snapshot

    void recordVideo(); // Abstract method to record a video

    // Private method to greet (used internally)
    private void greet() {
        System.out.println("Good Morning");
    }

    // Default method to record video in 4k
    default void record4KVideo() {
        greet(); // Calls the private greet method
        System.out.println("Recording in 4k...");
    }
}

// Interface defining Wi-Fi-related functionalities
interface MyWifi {
    String[] getNetworks(); // Abstract method to get a list of networks

    void connectToNetwork(String network); // Abstract method to connect to a network
}

// Class representing a basic cell phone
class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }
}

// Class representing a smartphone that extends MyCellPhone and implements
// MyWifi, MyCamera
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
    // Implementation of camera-related functionalities
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    // Implementation of Wi-Fi-related functionalities
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Harry", "Prashanth", "Anjali5G" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

// Main class to test the functionality
public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();

        // Testing camera-related functionality
        ms.record4KVideo(); // Calls the default method in MyCamera interface

        // Testing Wi-Fi-related functionality
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
