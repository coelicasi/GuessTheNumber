import javax.swing.*;

public class GuessingGame {

    static void  GuessTheNumber(){
        int correctNumber = (int) (Math.random()*10 +1);

        int guess = 0;

        String response = JOptionPane.showInputDialog("Enter your guess now!");

        guess = Integer.parseInt(response);

        System.out.println(guess);

        if(guess < 1 || guess > 100) {
            System.out.println("your guess must be between 1 and 10");
        }
        else if (guess == correctNumber){
            System.out.println("you got it!");
            Score.increaseScore();
            //score = score+1;
        }
        else if (guess != correctNumber){
            System.out.println("you lose");
        }

        System.out.println("The actual answer is " + correctNumber);

        String cont = "";
        cont = JOptionPane.showInputDialog("Play Again? Y/N");


        if(cont.equals("Y")){
            GuessTheNumber();
            //System.out.println(cont);
        }else{
            System.out.println("thanks for playing! Your final score: " + Score.currentScore());
        }

        }

    public static void main(String[] args){
        GuessTheNumber();

    }
}
