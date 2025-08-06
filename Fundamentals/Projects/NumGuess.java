package Fundamentals.Projects;
import java.util.Scanner;
import java.util.Random;

public class NumGuess {
    public static void main(String[] args){
        Game.game();
    }
}
class Game{
    private static Scanner sc = new Scanner(System.in);
    private static boolean loop_menu = true;
    private static int life = 10;
    static void game(){
        display();
        while (loop_menu) {
            menu();
        }
    }
    private static void menu() {
        System.out.print("Choose the number : ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                start();
                display();
                break;
            case 2:
                Tutorials();
                display();
                break;
            case 3:
                loop_menu = false;
                System.out.println("\n\n Exiting...");
                System.out.println("Thank you for playing the game.");
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

    }
    private static void display(){
        System.out.println("\n$$$$$$$$$$$$$$$$$$");
        System.out.println("$  1. Start      $");
        System.out.println("$  2. Tutorials  $");
        System.out.println("$  3. Exit       $");
        System.out.println("$$$$$$$$$$$$$$$$$$\n");

    }
    private static void start(){
        int Secret = randomSecretdata();
        boolean loop = true;
        System.out.println("\n\nYou have only "+life+ " lifes");
        while (loop) {
            if(life == 0){
                loop = false; break;
            }
            System.out.print("Guess a number 1 to 100 : ");
            int guess = sc.nextInt();
            if (guess == Secret){
                sc.nextLine();
                System.out.println("\n You win with a life of "+life );
                boolean smenu = true;
                while(smenu){
                    System.out.print("Do you want to try again (y/n) : ");
                    char it = sc.next().charAt(0);
                    if(it == 'y' || it == 'Y'){
                        life = 10;
                        smenu = false;
                        start();
                        break;
                        
                    }else if(it == 'n'|| it == 'N'){
                        life = 10;
                        loop = false;
                        smenu = false;
                        break;
                    }else{

                        System.out.println("Invalid Input");
                    }
                }
                break;
            }else if(guess > Secret){
                life--;
                System.out.println("Too High");
            }else if(guess < Secret){
                life--;
                System.out.println("Too Low");
            }
        }

    }
    private static int randomSecretdata(){
        Random random = new Random();
        return random.nextInt(100)+1;
    }
    private static void Tutorials(){
        System.out.println("\n\nThis is a number guessing game.");
        System.out.println("You have "+life+ "life.");
        System.out.println("Each attempt reduce by 1 life\n\n");
    }
}
