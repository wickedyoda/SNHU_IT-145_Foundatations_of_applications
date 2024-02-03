import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        int currentColumn;
        char currentColumnLetter;

        numRows = scnr.nextInt();
        numColumns = scnr.nextInt();

        /* Your solution goes here */
        for (currentRow = 1; currentRow <= numRows; currentRow++) {
            for (currentColumn = 1; currentColumn <= numColumns; currentColumn++) {
                currentColumnLetter = (char) ('A' + currentColumn - 1);
                System.out.print(currentRow + "" + currentColumnLetter + " ");
            }
        }

        System.out.println("");
    }
}