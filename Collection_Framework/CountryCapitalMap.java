import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapitalMap {

    public static void main(String[] args) {
        // Create a HashMap to store country-capital mappings
        Map<String, String> countryCapitalMap = new HashMap<>();
        // Populate the map with some country-capital pairs
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Australia", "Canberra");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a country name
        System.out.print("Enter a country name: ");
        String country = scanner.nextLine().trim();

        // Check if the entered country exists in the map
        if (countryCapitalMap.containsKey(country)) {
            // If the country exists, retrieve and print its capital
            String capital = countryCapitalMap.get(country);
            System.out.println("The capital of " + country + " is " + capital);
        } else {
            // If the country does not exist, notify the user
            System.out.println("Country not found in the map.");
        }
    }
}
