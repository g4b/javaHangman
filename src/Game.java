import java.util.Random;

public class Game {

    int numGuesses;
    int randomIndex;
    String word;
    String underscores;

    public Game(){
        this.numGuesses = 8;
        String[] words = {"bunny", "shirt", "music", "zoology", "textbook", "xylophone", "graph"};
        this.randomIndex = new Random().nextInt(words.length);
        this.word = words[randomIndex];
        for (int i = 0; i < word.length(); i++){
            this.underscores += "_";
        }
    }

    public void guessLetter(char letter){
        char[] undArray = underscores.toCharArray();
        for (int i = 0; i < word.length(); i++){
            if (word.substring(i, i + 1).equals(letter)){
                undArray[i] = letter;
                this.numGuesses++;
            }
        }
        this.numGuesses--;
    }

}
