import java.util.Scanner;

public class JPD304 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int total=0, count=0, price=0;
        while (true){
            System.out.print("Please enter meal dollars or enter -1 to stop: ");
            price = keyboard.nextInt();
            if (price==-1) break;
            total+=price;
            count++;
        }
        System.out.println("餐點總費用:" + total);
        System.out.printf(" %d 道餐點平均費用為: %.2f %n", count, 1.0*total/count);
    }
}
