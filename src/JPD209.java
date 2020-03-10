import java.util.Scanner;

public class JPD209 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            System.out.print("請輸入x座標:");
            double x = keyboard.nextDouble();
            System.out.print("請輸入x座標:");
            double y = keyboard.nextDouble();

            if (x==0){
                System.out.printf("(%.2f,%.2f)在y軸上%n", x, y);
            }else if (y==0){
                System.out.printf("(%.2f,%.2f)在x軸上%n", x, y);
            }else if (x>0 && y>0){
                System.out.printf("(%.2f,%.2f)在第一象限%n", x, y);
            }else if (x>0 && y<0){
                System.out.printf("(%.2f,%.2f)在第四象限%n", x, y);
            }else if (x<0 && y>0){
                System.out.printf("(%.2f,%.2f)在第二象限%n", x, y);
            }else if (x<0 && y<0){
                System.out.printf("(%.2f,%.2f)在第三象限%n", x, y);
            }
        }
    }
}
