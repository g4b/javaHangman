import java.util.Random;
import java.util.Arrays;

public class Game {

    int numGuesses;
    int randomIndex;
    String word;
    String underscores = "";

    public Game(){
        this.numGuesses = 8;
        String[] words = {"bunny", "shirt", "music", "zoology", "textbook", "xylophone", "graph"};
        this.randomIndex = new Random().nextInt(words.length);
        this.word = words[this.randomIndex];
        for (int i = 0; i < word.length(); i++){
            this.underscores += "_";
        }
    }

    public void setUnderscores(String underscores){
        this.underscores = underscores;
    }

    public void guessLetter(String letter){
        String[] undArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++){
            undArray[i] = "_";
        }
        for (int i = 0; i < word.length(); i++){
            if (word.substring(i, i + 1).equals(letter)){
                undArray[i] = letter;
                this.numGuesses++;
            }
        }
        String newUnd = "";
        for (int i = 0; i < undArray.length; i++){
            newUnd += undArray[i];
        }
        this.showUnd();
        this.numGuesses--;
    }

    public void showUnd(){
        System.out.println(this.underscores);
    }

}
 // I- I- I don't know where I am. I don't know where I am. Please, can anyone help me, I don't know where I am. I don't know where I am