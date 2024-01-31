import java.util.Scanner;

public class RangeDetector {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int x;

      x = scnr.nextInt();

      if (x < 5) {
         System.out.println("d");
      }
      else if (x < 25) {
         System.out.println("k");
      }
      else if (x < 40) {
         System.out.println("m");
      }
      else {
         System.out.println("p");
      }
   }
}