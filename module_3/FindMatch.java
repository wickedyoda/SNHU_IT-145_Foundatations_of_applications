
import java.util.Scanner;

public class FindMatch {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currAge;

        currAge = scnr.nextInt();

        while (currAge < 18 || currAge > 35) {
            if (currAge < 18) {
                System.out.println("Very young");
            } else {
                System.out.println("Already adult");
            }
            currAge = scnr.nextInt();
        }

        System.out.print("Perfect match");
    }
}