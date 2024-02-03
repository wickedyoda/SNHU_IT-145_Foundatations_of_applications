import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int firstNumber;
      int finalNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      firstNumber = input.nextInt();
      finalNumber = input.nextInt();
      
      for (i = firstNumber; i <= finalNumber; i++) {
    
         System.out.print(i + " ");
    
