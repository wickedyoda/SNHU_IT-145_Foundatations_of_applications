import java.util.Scanner;

public class FindAlpha {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String passCode;

        passCode = scnr.next();

        for (int i = 1; i <= passCode.length(); i++) {
            if (Character.isLetter(passCode.charAt(i - 1))) {
                System.out.println("Alphabetic at " + i);
            }
        }
    }
}