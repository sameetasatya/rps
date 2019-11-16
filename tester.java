package drawable;

import java.util.Random;
import java.util.Scanner;


public class tester {

    private String r;
    private String p;
    private String s;
    private int randomInt;
    private String computerChoice;

    public static void main(String[] args) {

        Boolean gameActive = true;
        String userChoice;
        String aiChoice;
        String result;


        while (gameActive) {

            //Select random number 0,1,or 2, where 0=rock, 1=paper, 2=scissor
            int rnd = (int)(Math.random() * 3);

            System.out.println("Play Rock (r), Paper (p), or Scissors (s)");
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextLine();

            String ai = "";
            if(rnd == 0){
                aiChoice="r";
            }
            else if(rnd == 1){
                aiChoice="p";
            }
            else {
                aiChoice="s";
            }

            //Check Winner
            //Tie Case
            if (userChoice.equals(aiChoice)) {
                result = "It's a tie";
            }
            //Lose Case
            else if (userChoice.equals("p") && rnd == 2 || userChoice.equals("r") && rnd == 1 || userChoice.equals("s") && rnd == 0) {
                result = "You Lose!";
            }
            //Win Case
            else
            result = "You win!";


            System.out.println("You picked: " + userChoice + " and the AI picked: " + aiChoice + ". " + result);
            System.out.println("Do you want to play again? y / n");
            String restart = scanner.nextLine();
            if (restart.equals("N") || restart.equals("n")) {
                gameActive = false;
            }
        }



    }
}