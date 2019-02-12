import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        int guesses = 8;
        String[] words = {"bunny", "shirt", "music", "zoology", "textbook", "xylophone", "graph"};
        int randomIndex = new Random().nextInt(words.length);
        String word = words[randomIndex];
        String underscores;
        for(int i = 0; i < word.length(); i++){
            // underscores += "_" --> not sure how to do this in Java?
        }
    }

}
