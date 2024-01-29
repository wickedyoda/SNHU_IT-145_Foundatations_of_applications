import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;

        char userChar = 'a';
        String userString = "New string";

        try {
            System.out.println("Enter integer: ");
            userInt = scnr.nextInt();

            System.out.println("Enter double: ");
            userDouble = scnr.nextDouble();

            System.out.println("Enter character: ");
            userChar = scnr.next().charAt(0);

            System.out.println("Enter string: ");
            scnr.nextLine(); // Consume the newline character left by the previous nextDouble()
            userString = scnr.nextLine();

            // Output the four values on a single line separated by a space
            System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);

            // Output the four values in reverse
            System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);

            // Cast the double to an integer and output that integer
            int intFromDouble = (int) userDouble;
            System.out.println("Casting double to int: " + intFromDouble);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type.");
            scnr.nextLine(); // Clear the input buffer
        } finally {
            scnr.close(); // Close the Scanner to prevent resource leak
        }
    }
}
