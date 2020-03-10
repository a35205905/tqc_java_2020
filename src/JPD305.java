import java.util.Scanner;

public class JPD305 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Please enter value:");
            int n = keyboard.nextInt();
            int total = 1;
            if (n>=1 && n<=10){
                for (int j = 1; j <= n; j++) {
                    total *= j;
                }
                System.out.printf("%d!: %d\n", n, total);
            } else {
                System.out.println("Error, the value is out of range.");
            }
        }
    }
}
