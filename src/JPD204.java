import java.util.Scanner;

public class JPD204 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            System.out.println("Input:");
            int num = keyboard.nextInt();
            if (num % 5 == 0 && num % 9 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
