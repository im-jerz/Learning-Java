package Fundamentals.Projects;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.Console;
import java.io.IOException;
import java.security.Key;



public class Hangman {
    public static void main(String[] args){
        splash();
    }
    static void splash(){
        
        boolean loop = true;
        while (loop) {
            System.out.println("\n\n#####################################################");
        System.out.println("#   _   _                                           #");
        System.out.println("#  | | | | __ _ _ __   __ _ _ __ ___   __ _ _ __    #");
        System.out.println("#  | |_| |/ _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\   #");
        System.out.println("#  |  _  | (_| | | | | (_| | | | | | | (_| | | | |  #");
        System.out.println("#  |_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|  #");
        System.out.println("#                     |___/                         #");
        System.out.println("#####################################################\n");
        System.out.println("\t1. Start");
        System.out.println("\t2. Guide");
        System.out.println("\t3. Exit");
            System.out.print("\nChoose a number : ");
            int choose = UserInput.sc.nextInt();
            switch (choose) {
                case 1:
                    Game.game();
                    
                    break;
                case 2:
                    Guide.g();
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}



class Game{
    private static int life = 7;
    private static char[] CorrectAnswer;
    
    static void game(){
        life = 7;
        String word = SecretWord();
        CorrectAnswer = new char[word.length()];
        System.out.println(CorrectAnswer.length);
        boolean loop = true;
        while(loop){
            int g = 0;
            for(int i =0; i<CorrectAnswer.length;i++){
                if(CorrectAnswer[i] != '\u0000'){
                    g++;
                }
            }
            
            man();
            if(life == 1){
                System.out.println("You lose !!!");
                loop = false;
                System.out.println("Press any key to exit ...");
                KeyInput.getKey();
                break;
            }
            blanks();
            if(g==CorrectAnswer.length) {
                System.out.println("You find the correct answer !!!");
                loop = false;
                System.out.print("Press y  to try again and Press any key to exit : ");
                char yt = KeyInput.getKey();
                if(Character.toLowerCase(yt) == 'y') game();
                break;
            }
            System.out.print("Guess a letter : ");
            char ch =UserInput.sc.next().charAt(0);
            checker(word, ch);
        }
    }

    static String checker(String SecWord,char value){
        char[] word = SecWord.toCharArray();
        int flag = 0;
        for(int i =0; i<word.length;i++){
            if(Character.toLowerCase(word[i]) == Character.toLowerCase(value)){
                CorrectAnswer[i] = Character.toUpperCase(value);
                flag = 1;
            }
        }
        if(flag ==0) life--;
        return null;
    }

    static void blanks(){
        for(int i = 0; i<CorrectAnswer.length;i++){
            if(CorrectAnswer[i] == '\u0000'){
                System.out.print("_ ");
            }else{
                System.out.print(CorrectAnswer[i]+" ");
            }
        }
        System.out.print("\n");
    }

    static void man(){
        System.out.println("|--------");
        System.out.printf("|	%c\n", (life == 7) ? ' ':'O');
        System.out.printf("|      %c%c%c\n",(life == 7 || life == 6) ? ' ':'\\', (life == 7) ? ' ':'|', (life <= 7&&life>=5) ? ' ':'/');
        System.out.printf("|       %c\n",(life <= 7&&life>=4) ? ' ':'|');
        System.out.printf("|      %c %c\n",(life <= 7&&life>=3) ? ' ':'/',(life <= 7&&life>=2) ? ' ':'\\');
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("############");
        System.out.println("#	   ### ");
        System.out.println("#	     ###");
        System.out.println("################");
    }

    static String SecretWord(){
        Random random = new Random();
        String[] words = {
    "apple", "banana", "cat", "dog", "elephant", "fish", "grape", "hat", "ice", "jungle",
    "kite", "lion", "monkey", "nest", "orange", "pencil", "queen", "robot", "snake", "tree",
    "umbrella", "violin", "whale", "xylophone", "yarn", "zebra", "book", "cloud", "drum", "egg"
};      
        return words[random.nextInt(words.length)];
    }
}
class Guide{
    static void g() {
        System.out.println("\n\n HOW TO PLAY HANGMAN (6 Lives Edition)");
        System.out.println();
        System.out.println(" OBJECTIVE:");
        System.out.println("Guess the hidden word one letter at a time before you run out of lives.");
        System.out.println();

        System.out.println(" GAME RULES:");
        System.out.println("1. The game picks a secret word (e.g., 'banana').");
        System.out.println("2. The word is hidden as underscores, like this: _ _ _ _ _ _");
        System.out.println("3. You guess one letter per turn.");
        System.out.println();

        System.out.println("/ CORRECT GUESS:");
        System.out.println("- If your guessed letter is in the word, it will be revealed in all correct positions.");
        System.out.println("  Example:");
        System.out.println("  Guess: a");
        System.out.println("  _ a _ a _ a");
        System.out.println();

        System.out.println("X WRONG GUESS:");
        System.out.println("- You lose 1 life for each wrong guess.");
        System.out.println("- You have a total of 6 lives.");
        System.out.println();

        System.out.println(" 6 LIVES BREAKDOWN:");
        System.out.println("  1st wrong guess  → Head");
        System.out.println("  2nd wrong guess  → Body");
        System.out.println("  3rd wrong guess  → Left Arm");
        System.out.println("  4th wrong guess  → Right Arm");
        System.out.println("  5th wrong guess  → Left Leg");
        System.out.println("  6th wrong guess  → Right Leg (Game Over!)");
        System.out.println();

        System.out.println(" WINNING:");
        System.out.println("- You win if you guess the entire word before losing all 6 lives.");
        System.out.println();

        System.out.println(" LOSING:");
        System.out.println("- You lose if you make 6 incorrect guesses and the hangman is complete.");
        System.out.println();

        System.out.println(" EXAMPLE GAME:");
        System.out.println("Secret Word: _ _ _ _ _");
        System.out.println("Guess: e  → X (Wrong, 1 life lost)");
        System.out.println("Guess: a  → / _ a _ _ _");
        System.out.println("Guess: s  → X (Wrong, 2 lives lost)");
        System.out.println("Guess: r  → / _ a r _ _");
        System.out.println("Guess: k  → / _ a r k _");
        System.out.println("Guess: d  → / d a r k _");
        System.out.println("Guess: l  → / d a r k l   🎉 YOU WIN!\n");
        System.out.print("Press any key to exit... ");
        KeyInput.getKey();
    }
}
class UserInput{
    static final Scanner sc = new Scanner(System.in);
}
class KeyInput {
    public static char getKey() {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console found. Run this in a terminal.");
            return 0;
        }

        try {
            int ch = console.reader().read(); 
            return (char) ch;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}