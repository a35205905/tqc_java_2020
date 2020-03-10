import java.util.Scanner;

public class JPD208 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Input:");
            int num = keyboard.nextInt();
            if (num >= 90) {
                System.out.println("Your grade is A");
            } else if (num >= 80) {
                System.out.println("Your grade is B");
            } else if (num >= 70) {
                System.out.println("Your grade is C");
            } else if (num >= 60) {
                System.out.println("Your grade is D");
            } else if (num < 60){
                System.out.println("Your grade is F");
            }
        }
    }
}
