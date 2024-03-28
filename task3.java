/*
    write a program of the travel planner using java programming language
*/
import java.util.*;
import java.io.*;
public class task3
{
    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println(" Welcome to the Travel Itinerary Planner ");
        // for taking input from the user using scanner class  for number of destinations.
        System.out.print("Enter number of destinations: ");
        int numDestinations =sn.nextInt();
        sn.nextLine();
        String[] destinations = new String[numDestinations];
        // using for loop for taking input as destination 
        for (int i = 0; i < numDestinations; i++) 
        {
            System.out.print("Enter destination " + (i + 1) + ": ");
            destinations[i] =sn.nextLine();
        }
        // for entering data from user like date,preference,cost.....
        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDate =sn.nextLine();
        System.out.print("Enter end date (YYYY-MM-DD): ");
        String endDate =sn.nextLine();
        System.out.print("Enter your preferences (e.g.accommodation, transportation): ");
        String preferences =sn.nextLine();
        System.out.println("\nGenerating your travel itinerary...\n");
        for (int i = 0; i < numDestinations; i++) {
            System.out.println("Destination: " + destinations[i]);
            System.out.println("Start Date: " + startDate);
            System.out.println("End Date: " + endDate);
            System.out.println("Preferences: " + preferences);
            String weather = fetchWeather(destinations[i], startDate);
            System.out.println("Weather information: " + weather);
            displayMap(destinations[i]);
            double budget = calculateBudget(startDate, endDate, destinations[i]);
            System.out.println("Estimated budget: $" + budget);
            System.out.println("##################################\n");
        }
    sn.close();
    }
    private static String fetchWeather(String destination, String date) {
    return "Sunny with 25°C";
    }
    private static void displayMap(String destination) {
    System.out.println("Map: [Google Maps Placeholder]");
    }
    private static double calculateBudget(String startDate, String endDate, String destination) 
    {
    return 1000.00;
    }
}