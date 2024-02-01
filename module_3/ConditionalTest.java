
public class ConditionalTest {
    public static void main(String[] args) {
        int myNumber;
        int yourNumber;

        myNumber = 6;
        yourNumber = (myNumber == 8) ? myNumber + 9 : myNumber - 3;

        System.out.println(yourNumber);
    }
}