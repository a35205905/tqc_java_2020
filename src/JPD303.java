public class JPD303 {
    public static void main (String[] args) {
        System.out.printf("1~1000中的完美數有: ");
        for (int num=1; num<=1000; num++){
            int sum = 0;
            for (int i=1; i<num; i++){
                if (num%i==0){
                    sum += i;
                }
            }
            if (num==sum){
                System.out.printf("%d ", num);
            }
        }
    }
}
