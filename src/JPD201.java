import java.util.Scanner;

public class JPD201 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            System.out.println("Please enter score:");
            int k = keyboard.nextInt();
            if (k >= 60) {
                System.out.println("You Pass");
            }
            System.out.println("End");
        }
    }
}
