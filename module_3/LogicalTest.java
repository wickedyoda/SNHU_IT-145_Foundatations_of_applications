public class LogicalTest {
   public static void main(String[] args) {
      int x;

      x = 5;

      if (!((x > 6) || (x < 3))) {
         System.out.println("a");
      }
      if ((x > 6) && (x < 2)) {
         System.out.println("b");
      }
      System.out.println("c");
   }
}