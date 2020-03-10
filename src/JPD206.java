import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JPD206 {
    static boolean is_all_pass;
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) {
        for (int i = 0; i < 4; i++){
            is_all_pass  = true;
            String[] subjects = {"Chinese", "English", "Math"};
            List<String> fail_subjects = new ArrayList<>();
            for (String subject: subjects){
                if (calscore(subject) == false) {
                    fail_subjects.add(subject);
                }
            }
            for (String fail_subject: fail_subjects) {
                System.out.printf("%s failed.\n", fail_subject);
            }
            if (is_all_pass == true) {
                System.out.println("All Pass.");
            }
        }
    }

    static boolean calscore(String subject){
        boolean is_pass;
        System.out.printf("Input %s score:", subject);
        int score = keyboard.nextInt();
        if (score < 60) {
            is_all_pass = false;
            is_pass = false;
        } else {
            is_pass = true;
        }
        return is_pass;
    }
}
