import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userValue;
        int maximumNumber;

        userValue = scnr.nextInt();
        maximumNumber = userValue;

        while (userValue > 0) {
            if (userValue > maximumNumber) {
                maximumNumber = userValue;
            }

            userValue = scnr.nextInt();
        }

        System.out.print("Max value: " + maximumNumber);
    }
}