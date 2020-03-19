import java.util.Scanner;

public class JPD408 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        for (int i=0; i<2; i++){
            System.out.print("Input a string: ");
            String s = keyboard.nextLine();
            System.out.println(reverse(s));

        }
    }

    static String reverse(String s){
        if (s.equals("")){
            return "";
        }else{
            return reverse(s.substring(1)) + s.substring(0, 1);
        }
    }
}
