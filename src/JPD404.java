import java.util.Scanner;

public class JPD404 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.printf("Input m:");
            int m = keyboard.nextInt();
            if (m==999) break;
            System.out.printf("Input n:");
            int n = keyboard.nextInt();
            System.out.println("最大公因數為 = " + gcd(m,n));
        }
    }

    static int gcd(int m, int n){
        if (n==0){
            return m;
        }else{
            return gcd(n, m%n);
        }
    }
}
