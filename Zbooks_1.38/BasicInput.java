import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;

        char userChar = 'a'; // FIXME Define char and string variables similarly
        String userString = "New string";

        System.out.println("Enter interger:  ");
        userInt = scnr.nextInt();
        System.out.println("Enter double:  ");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:  ");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter string:  ");
        userString = scnr.next();

        // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println (userInt + " " + userDouble + " " + userChar + " " + userString);


        // FIXME (2): Output the four values in reverse

        // FIXME (3): Cast the double to an integer, and output that integer

        return;
    }
}