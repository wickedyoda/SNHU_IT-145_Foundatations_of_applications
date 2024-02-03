
import java.util.Scanner;

public class DoProduct {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int enteredValue;
        int finalProduct;

        finalProduct = 1;

        enteredValue = scnr.nextInt();

        while (enteredValue > 0) {
            finalProduct = finalProduct * enteredValue;
            enteredValue = scnr.nextInt();
        }

        System.out.print("Product: " + finalProduct);
    }
}