public class JPD107 {
    public static void main (String[] args){
        int action=1, skill=2, teamgame=3;
        System.out.println("The basketball grade is " + Basketball.calGrade(action, skill, teamgame));
        System.out.println("The baseball grade is " + Baseball.calGrade(skill, teamgame));
    }
}

class Basketball {
    static int calGrade(int action, int skill, int teamgame){
        return action + skill + teamgame;
    }
}

class Baseball {
    static int calGrade(int skill, int teamgame){
        return 10 + skill + teamgame;
    }
}