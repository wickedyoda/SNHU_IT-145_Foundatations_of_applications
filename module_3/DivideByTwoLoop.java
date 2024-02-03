import java.util.Scanner;

public class DivideByTwoLoop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;

        userNum = scnr.nextInt();

        int num = userNum;
        while (num > 1) {
            num = num / 2;
            System.out.print(num + " ");
        }

        System.out.println("");
    }
}