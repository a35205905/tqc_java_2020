import java.util.Scanner;

public class JPD409 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 2 ; i++) {
            System.out.print("Input a string: ");
            String s = keyboard.nextLine();
            System.out.print("Input a character: ");
            String c = keyboard.nextLine();
            System.out.println(removeChar(s, c));
        }
    }

    static String removeChar(String s, String c){
        if (s.equals("")){
            return "";
        }else if(s.substring(0, 1).equals(c)){
            return removeChar(s.substring(1), c);
        }else{
            return s.substring(0, 1) + removeChar(s.substring(1), c);
        }
    }
}
