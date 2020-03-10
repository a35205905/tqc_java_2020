import java.util.Scanner;

public class JPD306 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.println("Input:");
            int m = keyboard.nextInt();
            if (m==999) break;
            int n = keyboard.nextInt();
            System.out.println(powerOf(m, n));
        }
    }

    // 執行100, 7會得到276447232
    // 為int溢位
    static int powerOf (int m, int n){
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= m;
        }
        return total;
    }
}
