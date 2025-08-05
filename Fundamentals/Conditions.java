package Fundamentals;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isActive = true;
        if(isActive){ // if condition
            System.out.println("The account is active");
        }

        if(isActive){ // if & else condition
            System.out.println("The account is active");
        }else{
            System.out.println("The account is NOT active");
        }

        int grade = 75;

        if(grade >=75){//if else if
            System.out.println("Good Job");
        }else if( grade < 75){
            System.out.println("Study hard");
        }else{
            System.out.println("Your are NOT enrolled");
        }

        //switch

        String future = "Good";

        switch (future) {
            case "Good":
                System.out.println("Maging programmer");
                break;
            case "Bad":
                System.out.println("Magasawa ng programmer");
                break;
            default:
                System.out.println("Maging keyboard");
                break;
        }
        //Ternary
        System.out.printf("The account is %sonline\n", (isActive) ? "" : "NOT ");

        //LOOPS

        //while
        int i =0;
        while (i < 10) {
            i++;
            System.out.printf(i+ " ");
        }
        i=0;
        
        System.out.println();
        //do - while
        String username = "im-jerz";
        String password = "Admin123";
        String User_Username;
         String User_Password;
        do{
            System.out.print("Enter username : ");
            User_Username = sc.nextLine();
            System.out.print("Enter password : ");
            User_Password = sc.nextLine();
        }while(!User_Username.equals(username) || !User_Password.equals(password));

        System.out.println();
        //For loop
        for(i =0; i<10; i++)
        {
            System.out.printf(i+" ");
        }
    }
}
