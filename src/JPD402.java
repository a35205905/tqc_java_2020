import java.util.Scanner;

public class JPD402 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.printf("Input n (0 <= n <= 16):");
            int n = keyboard.nextInt();
            if (n==999) break;
            System.out.println(n + " 的階層(尾端遞迴) = " + factorial(n, 1));
            System.out.println(n + " 的階層(迴圈) = " + loop(n));
        }

    }

    static int factorial(int n, int sum){
        if (n==1){
            return sum;
        }else{
            return factorial(n-1, n*sum);
        }

    }

    static int loop(int n){
        int sum = 1;
        for (int i=1; i<=n; i++){
            sum *= i;
        }
        return sum;
    }
}
