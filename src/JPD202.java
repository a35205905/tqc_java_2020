import java.util.Scanner;

public class JPD202 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            System.out.println("Input:");
            int num1 = keyboard.nextInt();
            int num2 = keyboard.nextInt();
            int max, min;
            if (num1 >= num2) {
                max = num1;
                min = num2;
            } else {
                max = num2;
                min = num1;
            }
            System.out.printf("%d is larger than %d %n", max, min);

        }
    }
}
