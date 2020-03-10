import java.util.Scanner;

public class JPD307 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.println("Input:");
            int m = keyboard.nextInt();
            if (m==999) break;
            int n = keyboard.nextInt();
            System.out.println(gcd(m, n));
        }
    }

    static int gcd (int m, int n){
        int result = 1;
        for (int i = m; i >= 1; i--) {
            if (m%i==0 && n%i==0){
                result = i;
                break;
            }
        }
        return result;
    }
}
