import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String playerOneChoice;
        String playerTwoChoice;
        String userPlayAgain;
        boolean playAgain = true;
        boolean playerOneValid = false;
        boolean playerTwoValid = false;
        boolean validPlayAgain = false;

        do {
            do {
                System.out.println("What does player one choose? R/P/S");
                playerOneChoice = scan.nextLine();
                if (playerOneChoice.equalsIgnoreCase("R") || (playerOneChoice.equalsIgnoreCase("P") || (playerOneChoice.equalsIgnoreCase("S")))) {
                    playerOneValid = true;
                }
                else {
                    System.out.println("You inputted an invalid option. Please try again.");
                }
            } while (!playerOneValid);

            do {
                System.out.println("What does player two choose? R/P/S");
                playerTwoChoice = scan.nextLine();
                if (playerTwoChoice.equalsIgnoreCase("R") || (playerTwoChoice.equalsIgnoreCase("P") || (playerTwoChoice.equalsIgnoreCase("S")))) {
                    playerTwoValid = true;
                }
                else {
                    System.out.println("You inputted an invalid option. Please try again.");
                }
            } while (!playerTwoValid);

            if (playerOneChoice.equalsIgnoreCase(playerTwoChoice)) {
                System.out.println("It is a tie!");
            }
            else if (playerOneChoice.equalsIgnoreCase("R") && playerTwoChoice.equalsIgnoreCase("P")) {
                System.out.println("Player two wins!");
            }
            else if (playerOneChoice.equalsIgnoreCase("R") && playerTwoChoice.equalsIgnoreCase("S")) {
                System.out.println("Player one wins!");
            }
            else if (playerOneChoice.equalsIgnoreCase("P") && playerTwoChoice.equalsIgnoreCase("R")) {
                System.out.println("Player one wins!");
            }
            else if (playerOneChoice.equalsIgnoreCase("P") && playerTwoChoice.equalsIgnoreCase("S")) {
                System.out.println("Player two wins!");
            }
            else if (playerOneChoice.equalsIgnoreCase("S") && playerTwoChoice.equalsIgnoreCase("P")) {
                System.out.println("Player one wins!");
            }
            else if (playerOneChoice.equalsIgnoreCase("S") && playerTwoChoice.equalsIgnoreCase("R")) {
                System.out.println("Player two wins!");
            }

            do {
                System.out.println("Do you want to play again?");
                userPlayAgain = scan.nextLine();
                if (userPlayAgain.equalsIgnoreCase("N")) {
                    validPlayAgain = true;
                    playAgain = false;
                }
                else if (userPlayAgain.equalsIgnoreCase("Y")) {
                    validPlayAgain = true;
                }
                else {
                    System.out.println("You must input Y or N. Please try again.");
                    validPlayAgain = false;
                }
            } while (!validPlayAgain);

        } while (playAgain);


    }
}
