
import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their favorite number
        System.out.print("Enter your favorite number: ");
        int favoriteNumber = scanner.nextInt(); // Read the user's input as an integer

        // Print the favorite number with a personalized message
        System.out.println("Your favorite number is " + favoriteNumber + ". That's a great choice!");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
