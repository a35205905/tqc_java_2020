import java.util.Scanner;

public class JPD401 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.printf("Input n (0 <= n <= 16):");
            int n = keyboard.nextInt();
            if (n==999) break;
            System.out.println(n + " 的階層 = " + factorial(n));
        }

    }

    static int factorial(int n){
        if (n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }

    }
}
