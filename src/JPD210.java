import java.util.Scanner;

public class JPD210 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Input a character:");
            String s = keyboard.nextLine();
            char c = s.charAt(0);
            if (c=='a' || c=='b'){
                System.out.println("You entered a or b:");
            } else if (c=='x') {
                System.out.println("You entered x");
            } else if (c=='y') {
                System.out.println("You entered y");
            } else {
                System.out.println("You entered something else.");
            }
        }
    }
}
