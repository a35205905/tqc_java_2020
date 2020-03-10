import java.util.Arrays;
import java.util.Scanner;

public class JPD207 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) {
        for (int i = 0; i < 4; i++){
            System.out.print("請輸入三個整數:");
            int[] side_lens = new int[3];
            for (int j = 0; j < side_lens.length; j++){
                side_lens[j] = keyboard.nextInt();
            }
            Arrays.sort(side_lens);
            // 三角形
            if (side_lens[0] + side_lens[1] > side_lens[2]){
                double result = Math.pow(side_lens[0], 2) + Math.pow(side_lens[1], 2) - Math.pow(side_lens[2], 2);
                if (result == 0){
                    System.out.println("直角三角形");
                }else if (result > 0){
                    System.out.println("銳角三角形");
                }else if (result < 0){
                    System.out.println("鈍角三角形");
                }
            } else {
                System.out.println("不可以構成三角形");
            }
        }
    }
}
