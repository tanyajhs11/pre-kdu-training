import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String string1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = sc.nextLine();

        // Print length of the first string
        System.out.println("The Length of the first string is " + string1.length());

        // Print length of the second string
        System.out.println("The Length of the second string is " + string2.length());

        // Check if the lengths are the same
        if (string1.length() == string2.length()) {
            System.out.println("The length of the two strings is same");
        } else {
            System.out.println("The length of the two strings is not  same");
        }

        // Check if the strings are equal
        if (string1.equals(string2)) {
            System.out.println("Two strings are equal");
        } else {
            System.out.println("Two strings are not equal");
        }

        sc.close();
    }
}