import java.util.Scanner;

public class Runner {

    public static void main(String[] args){

        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a letter:");
        String guess = sc.nextLine();
        if(sc.hasNextLine()){
            String input = sc.nextLine();
        } else {
            System.out.println("Sorry, that wasn't a string. Please try again.");
        }
        game.guessLetter(sc.next(".").charAt(0));

    }
}
