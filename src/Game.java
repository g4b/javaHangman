import java.util.Random;
import java.util.Arrays;

public class Game {

    int numGuesses;
    int randomIndex;
    String word;
    String[] undArray;
    String[] guessedLetters;
    int numOfGuess;

    public Game(){
        this.numGuesses = 8;
        String[] words = {"bunny", "shirt", "music", "prince", "knife", "graph", "parabola", "crumpet", "cypress", "zoology", "textbook", "xylophone", "epistemology", "onomatopoeia"};
        this.randomIndex = new Random().nextInt(words.length);
        this.word = words[this.randomIndex];
        this.undArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++){
            this.undArray[i] = "_";
        }
        this.guessedLetters = new String[30];
        this.numOfGuess = 0;
    }

    public void setUnderscores(String[] undArray){
        this.undArray = undArray;
    }

    public void guessLetter(String letter){
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).equals(letter)) {
                undArray[i] = letter;
                numGuesses++;
            }
        }
        setUnderscores(undArray);
        this.toString("");
        if (isCorrect(undArray)) {
            System.out.println("You Win!");
            this.numGuesses = 0;
        }
        this.numOfGuess++;
    }

    public void checkGuessed(String letter){
        if (this.numOfGuess == 0){
            this.addGuessedLetter(letter);
            this.guessLetter(letter);
        } else {
            if (guessed(letter)){
                System.out.println("You have already guessed that letter. Please pick another one.");
            } else {
                this.addGuessedLetter(letter);
                this.guessLetter(letter);
            }
        }
    }

    public void addGuessedLetter(String letter){
        this.guessedLetters[this.numOfGuess] = letter;
        System.out.println(this.guessedLetters);
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

    public boolean guessed(String letter){
        for (int i = 0; i < numOfGuess; i++){
            if (guessedLetters[i].equals(letter)){
                return true;
            }
        }
        return false;
    }

    public void lose(){
        if (numGuesses == 0){
            System.out.println("You Lose! The word was " + this.word);
        }
    }
}