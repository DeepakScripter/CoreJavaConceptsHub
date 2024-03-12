// Define a custom thread class to simulate a traffic signal
class TrafficSignalThread extends Thread {
    private String signalName;
    private int duration;

    // Constructor to initialize the signal name and duration
    public TrafficSignalThread(String signalName, int duration) {
        this.signalName = signalName;
        this.duration = duration;
    }

    // Override the run method to define the behavior of the traffic signal thread
    @Override
    public void run() {
        try {
            while (true) {
                // Print the signal status as ON
                System.out.println(signalName + " signal is ON");

                // Sleep for the specified duration
                Thread.sleep(duration);

                // Print the signal status as OFF
                System.out.println(signalName + " signal is OFF");

                // Depending on the current signal, start the next signal thread and wait for it
                // to finish
                if (signalName.equals("RED")) {
                    // Start YELLOW after RED
                    TrafficSignalSimulation.yellowThread.start();
                    TrafficSignalSimulation.yellowThread.join();
                } else if (signalName.equals("YELLOW")) {
                    // Start GREEN after YELLOW
                    TrafficSignalSimulation.greenThread.start();
                    TrafficSignalSimulation.greenThread.join();
                } else if (signalName.equals("GREEN")) {
                    // Start RED after GREEN
                    TrafficSignalSimulation.redThread.start();
                    TrafficSignalSimulation.redThread.join();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Main class to run the traffic signal simulation
public class TrafficSignalSimulation {
    // Define threads for each signal (RED, YELLOW, GREEN)
    public static Thread redThread = new TrafficSignalThread("RED", 3000);
    public static Thread yellowThread = new TrafficSignalThread("YELLOW", 1000);
    public static Thread greenThread = new TrafficSignalThread("GREEN", 2000);

    // Main method to start the simulation
    public static void main(String[] args) {
        // Start with the RED signal
        redThread.start();
    }
}
