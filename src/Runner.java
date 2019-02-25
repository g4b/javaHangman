import java.util.Scanner;

public class Runner {

    public static void main(String[] args){

        Game game = new Game();
        game.toString("");
        while (game.numGuesses < 9){
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess a letter:");
            if(sc.hasNextLine()){
                String guess = sc.nextLine();
                game.guessLetter(guess);
                game.numGuesses--;
            } else {
                System.out.println("Sorry, that wasn't a string. Please try again.");
            }
        }
    }
}

