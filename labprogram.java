import java.util.Scanner;

public class labprogram {

    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
        return (milesDriven / milesPerGallon) * dollarsPerGallon;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double milesPerGallon = scnr.nextDouble();
        double dollarsPerGallon = scnr.nextDouble();

        double cost10Miles = drivingCost(milesPerGallon, dollarsPerGallon, 10.0);
        double cost50Miles = drivingCost(milesPerGallon, dollarsPerGallon, 50.0);
        double cost400Miles = drivingCost(milesPerGallon, dollarsPerGallon, 400.0);

        System.out.printf("%.2f %.2f %.2f%n", cost10Miles, cost50Miles, cost400Miles);
     }
}
