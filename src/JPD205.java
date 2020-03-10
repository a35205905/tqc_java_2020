import java.util.Scanner;

public class JPD205 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            System.out.println("Enter an integer:");
            int num = keyboard.nextInt();
            if (num % 6 == 0) {
                System.out.printf("%d是2、3、6的倍數\n", num);
            } else if (num % 2 == 0) {
                System.out.printf("%d是2的倍數\n", num);
            } else if (num % 3 == 0) {
                System.out.printf("%d是3的倍數\n", num);
            } else {
                System.out.printf("%d不是2、3、6的倍數\n", num);
            }
        }
    }
}
