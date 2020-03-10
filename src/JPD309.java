import java.util.Scanner;

public class JPD309 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int num = keyboard.nextInt();
        for (int i = 1; i <= num ; i++) {
            if (i%7!=0 && (i%3==0 || i%5==0)){
                total += i;
            }else{
                continue;
            }
        }
        System.out.println("Answer: " + total);
    }
}
