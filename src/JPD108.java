public class JPD108 {
    public static void main (String[] args){
        int i = add(2, 3);
        double d = add(5.2, 4.3);
        String s = add("I love ", "Java!!");
        System.out.printf("%d %f %s %n", i, d, s);
    }

    static int add (int i, int j){
        System.out.printf("Adding two integer:%d,%d %n", i, j);
        return i+j;
    }

    static double add (double i, double j){
        System.out.printf("Adding two doubles:%2.1f,%2.1f %n", i, j);
        return i+j;
    }

    static String add (String i, String j){
        System.out.printf("Adding two strings:%s,%s %n", i, j);
        return i+j;
    }
}
