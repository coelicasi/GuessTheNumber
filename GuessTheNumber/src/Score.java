public class Score {
    public static int score = 0;

    private Score(){

    }

    public static void increaseScore(){
        score = score+1;
    }

    public static int currentScore(){
        return score;
    }

}
