import java.util.Scanner;

public class Relational {
public static void main (String [] args) {
    int userNum = 0;
    
    Scanner input = new Scanner(System.in);
    userNum = input.nextInt(); // Program will be tested with values: -9, -10, -11, -8.
    
    if (userNum <= -10) {
        System.out.println("less than or equal to -10");
    }
    else {
        System.out.println("more than -10");
    }
}
}