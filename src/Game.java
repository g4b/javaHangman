import java.util.Random;
import java.util.Arrays;

public class Game {

    int numGuesses;
    int randomIndex;
    String word;
    String[] undArray;

    public Game(){
        this.numGuesses = 8;
        String[] words = {"bunny", "shirt", "music", "zoology", "textbook", "xylophone", "graph"};
        this.randomIndex = new Random().nextInt(words.length);
        this.word = words[this.randomIndex];
        this.undArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++){
            this.undArray[i] = "_";
        }
    }

    public void setUnderscores(String[] undArray){
        this.undArray = undArray;
    }

    public void guessLetter(String letter){
        for (int i = 0; i < word.length(); i++){
            if (word.substring(i, i + 1).equals(letter)){
                undArray[i] = letter;
                this.numGuesses++;
            }
        }
        setUnderscores(undArray);
        this.toString("");
        if (isCorrect(undArray)){
            System.out.println("Congratulations! You solved the puzzle! Reload to play again.");
            this.numGuesses = 0;
        }
    }

    public void toString(String newUnd){
        for (int i = 0; i < undArray.length; i++){
            newUnd += undArray[i];
        }
        System.out.println(newUnd);
    }

    public boolean isCorrect(String[] undArray){
        String[] wordArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++){
            wordArray[i] = word.substring(i, i + 1);
        }
        return Arrays.equals(undArray, wordArray);
    }
}