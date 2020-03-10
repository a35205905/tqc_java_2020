import java.util.Scanner;

public class JPD203 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            System.out.println("Input an integer:");
            int num = keyboard.nextInt();
            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }
    }
}
