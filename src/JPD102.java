import java.util.Scanner;

public class JPD102 {
    public static void main (String[] args){
        System.out.printf("Please input:");
        double p = new Scanner(System.in).nextDouble();
        System.out.printf("%f kg=%f ponds",p, p*2.20462);
    }
}
