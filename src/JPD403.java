import java.util.Scanner;

public class JPD403 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.printf("Input m:");
            int m = keyboard.nextInt();
            if (m==999) break;
            System.out.printf("Input n:");
            int n = keyboard.nextInt();
            System.out.println("Ans(尾端遞迴) = " + power(m,n,1));
            System.out.println("Ans(迴圈) = " + loop(m,n));
        }
    }

    static int loop(int m, int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= m;
        }
        return sum;
    }

    static int power(int m, int n, int sum){
        if (n==0){
            return sum;
        }else{
            return power(m, n-1, m*sum);
        }
    }
}
