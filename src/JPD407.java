import java.util.Scanner;

public class JPD407 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        for (int i=0; i<2; i++){
            System.out.print("Input a string of numbers: ");
            String str = keyboard.nextLine();
            System.out.printf("尾端遞迴：%d\n", sumRecursive(str, 0));
            System.out.printf("迴圈：%d\n", sumLoop(str));
        }
    }

    private static int sumRecursive(String str, int n){
        if (str.equals("")){
            return n;
        }else{
            return sumRecursive(str.substring(1), n + Integer.parseInt(str.substring(0, 1)));
        }
    }

    private static int sumLoop(String str){
        int n = 0;
        for (int i=0; i<str.length(); i++){
            n += Integer.parseInt(str.substring(i, i+1));
        }
        return n;
    }
}