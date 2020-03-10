import java.util.Scanner;

public class JPD105 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x1, x5, x10, x50, total;
        String name;
        System.out.printf("請輸入你的姓名:");
        name = sc.nextLine();
        System.out.printf("Hi, %s,請輸入您的銅板的個數:%n", name);
        System.out.printf("請輸入1元數量:");
        x1=sc.nextInt();
        System.out.printf("請輸入5元數量:");
        x5=sc.nextInt();
        System.out.printf("請輸入10元數量:");
        x10=sc.nextInt();
        System.out.printf("請輸入50元數量:");
        x50=sc.nextInt();
        total = x1*1 + x5*5 + x10*10 + x50*50;
        System.out.printf(
                "您的錢總共有:%d 千 %d 百 %d 十 %d 元",
                total/1000,
                total%1000/100,
                total%100/10,
                total%10
        );
    }
}