package Fundamentals;
import java.util.Scanner;


public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();


        System.out.print("Enter your gwa : ");
        double gwa = scanner.nextDouble();


        System.out.println("Hello " + name);
        System.out.println("So you're " + age + " years old");
        System.out.println("Nice you have a gwa " + gwa);

        //Problems
        System.out.print("Enter a number (1 to 10) : ");
        int no = scanner.nextInt();

        //catcher for the newline
        System.out.println();

        System.out.println("Enter you favorite color : ");
        String color = scanner.nextLine();

        System.out.println("The number you enter is "+no);
        System.out.println("Your favorite color is "+ color);


        scanner.close();
        
    }
}
