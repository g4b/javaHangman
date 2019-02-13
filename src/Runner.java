import java.util.Scanner;

public class Runner {

    public static void main(String[] args){

        Game game = new Game();
        game.showUnd();
        while (game.numGuesses <= 8){
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess a letter:");
            if(sc.hasNextLine()){
                char guess = sc.next(".").charAt(0);
                game.guessLetter(guess);
            } else {
                System.out.println("Sorry, that wasn't a string. Please try again.");
            }
        }
    }
}
