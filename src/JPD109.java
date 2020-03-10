public class JPD109 {
    public static int adder(int s, int a, int e) {
        return s+a+e;
    }

    public static int gameRating (int s, int a, int e) {
        return adder(s, a, e);
    }

    public static void main (String[] args) {
        int skill = 6, action = 9, excitment = 8;
        System.out.printf("The rating of the game is %d", gameRating(skill, action, excitment));
    }
}
