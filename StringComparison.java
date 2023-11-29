import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Print length of the first string
        System.out.println("The length of the first string is " + firstString.length());

        // Print length of the second string
        System.out.println("The length of the second string is " + secondString.length());

        // Check if the lengths are the same
        if (firstString.length() == secondString.length()) {
            System.out.println("The length of the two strings is the same");
        } else {
            System.out.println("The length of the two strings is not the same");
        }

        // Check if the strings are equal
        if (firstString.equals(secondString)) {
            System.out.println("Two strings are equal");
        } else {
            System.out.println("Two strings are not equal");
        }

        scanner.close();
    }
}