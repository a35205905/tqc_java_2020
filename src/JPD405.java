import java.util.Scanner;

public class JPD405 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input the number n: ");
        int n = keyboard.nextInt();
        System.out.printf("Ans: %d", sum2(n));
    }

    static int sum2(int n){
        if (n==1){
            return 2;
        }else{
            return sum2(n-1)+2*n;
        }
    }
}
