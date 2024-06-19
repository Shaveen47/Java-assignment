import java.util.Scanner;

public class UserNameAge {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for their first name
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Ask user for their last name
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Ask user for their age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Print the number of characters in the last name
        System.out.println("Number of characters in your last name: " + lastName.length());

        // Check if the age is even or odd
        if (age % 2 == 0) {
            System.out.println("Your age is even.");
        } else {
            System.out.println("Your age is odd.");
        }
    }
}

