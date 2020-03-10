import java.util.Scanner;

public class JPD103 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input:");
        int total = 0;
        for(int i = 1; i <= 3; i++){
            int _input = sc.nextInt();
            total += _input;
        }
        System.out.printf("Average: %.2f", ((double)total/3));
    }
}
