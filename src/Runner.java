import java.util.Scanner;
import java.util.Random;

public class Runner {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a letter");
        String guess = sc.nextLine();
        if(sc.hasNextLine()){
            String input = sc.nextLine();
        } else {
            System.out.println("Sorry, that wasn't a string. Please try again.");
        }
    }
}
