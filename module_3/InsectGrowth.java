import java.util.Scanner;

public class InsectGrowth {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numInsects;

        numInsects = scnr.nextInt(); // Must be >= 1

        int insectCount = numInsects;

        while (insectCount < 200) {
            System.out.print(insectCount + " ");
            insectCount *= 2;
        }

        System.out.println();

    }
}