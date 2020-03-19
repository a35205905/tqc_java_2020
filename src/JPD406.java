import java.util.Scanner;

public class JPD406 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i <2 ; i++) {
            System.out.print("Input a string: ");
            String s = keyboard.nextLine();
            System.out.printf("%s has %d As\n", s, countA(s));
        }
    }

    public static int countA(String str){
        if (str.equals("")){
            return 0;
        }else if (str.substring(0, 1).equals(("A"))){
            return 1 + countA(str.substring(1));
        }else{
            return countA(str.substring(1));
        }
    }
}
