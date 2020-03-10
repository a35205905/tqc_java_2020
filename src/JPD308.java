import java.util.Scanner;

public class JPD308 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        do {
            System.out.print("請輸入消費金額，或輸入-1結束：");
            int price = keyboard.nextInt();
            if (price==-1) break;
            total += price;
        }while (true);
        System.out.printf("電腦周邊總消費：%d",total);
    }
}
