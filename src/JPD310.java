import java.util.Scanner;

public class JPD310 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int n = 0;
        while (true){
            System.out.printf("請輸入 n 的值(n > 0，且為偶數)：");
            n = keyboard.nextInt();
            if (n>0 && n%2==0) break;
        }
        int i = 0;
        do {
            i+=2;
            total += i;
        }while (i<n);
        System.out.printf("2+4+...+%d=%d",n,total);
    }
}
