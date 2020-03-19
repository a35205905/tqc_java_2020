import java.util.Scanner;

public class JPD410 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = keyboard.nextLine();
        System.out.print("Input a another character: ");
        String c1 = keyboard.nextLine();
        System.out.print("Input a character: ");
        String c2 = keyboard.nextLine();
        System.out.print(replace(s, c1, c2));
    }

    static String replace(String s, String c1, String c2){
        if (s.equals("")){
            return "";
        }else if(s.substring(0, 1).equals(c1)){
            return c2 + replace(s.substring(1), c1, c2);
        }else{
            return s.substring(0, 1) + replace(s.substring(1), c1, c2);
        }
    }
}
