import java.util.Scanner;

public class ShippingCalculator {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double shipWeightPounds;
      int shipCostCents = 0;
      final int FLAT_FEE_CENTS = 75;

      /* Your solution goes here  */
      final int CENTS_PER_POUND = 25;
      shipWeightPounds = scanner.nextDouble();
      shipCostCents = FLAT_FEE_CENTS + (int) (shipWeightPounds * CENTS_PER_POUND);

      System.out.println("Weight(lb): " + shipWeightPounds);
      System.out.println("Flat fee(cents): " + FLAT_FEE_CENTS);
      System.out.println("Cents per pound: " + CENTS_PER_POUND);
      System.out.println("Shipping cost(cents): " + shipCostCents);

      scanner.close();
   }
}
