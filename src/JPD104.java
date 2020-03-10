import java.util.Scanner;

public class JPD104 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2, len;
        System.out.print("請輸入第1組的x和y座標:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("請輸入第1組的x和y座標:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        len = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.printf(
                "介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f",
                x1,
                y1,
                x2,
                y2,
                len
        );
    }
}
