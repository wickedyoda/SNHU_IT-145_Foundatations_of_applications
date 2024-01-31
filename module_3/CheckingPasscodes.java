import java.util.Scanner;

public class CheckingPasscodes {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean hasDigit;
        String passCode;

        hasDigit = false;
        passCode = scnr.next();

        for (int i = 0; i < passCode.length(); i++) {
            if (Character.isDigit(passCode.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (hasDigit) {
            System.out.println("Has a digit.");
        } else {
            System.out.println("Has no digit.");
        }
    }
}