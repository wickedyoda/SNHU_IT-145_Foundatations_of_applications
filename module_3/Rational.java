import java.util.Scanner;

public class Relational {
public static void main (String [] args) {
    int numInches = 0;
    
    Scanner input = new Scanner(System.in);
    numInches = input.nextInt(); // Program will be tested with values: 10, 11, 12, 13, 14.
    
    if (numInches <= 12) {
        System.out.println("Foot or less");
    }
    else {
        System.out.println("More than a foot");
    }
}
}