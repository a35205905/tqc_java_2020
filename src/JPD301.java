import java.util.Scanner;

public class JPD301 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input:");
        int num = keyboard.nextInt();
        int sum = 0;
        for (int i=1; i<=num; i++){
            sum += i;
        }
        System.out.printf("1 + ... + %d = %d", num, sum);
    }
}
