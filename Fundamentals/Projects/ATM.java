package Fundamentals.Projects;
import java.util.Scanner;

public class ATM {
    static Scanner sc = new Scanner(System.in);
    static boolean isMenu = true;
    static char symbol = '$';
    static float Balance = 1000;

    public static void main(String[] args){
        
        display();
        while(isMenu){
            menu();
        }
    }
     static void display(){
        System.out.println("####################");
        System.out.println("#                  #");
        System.out.println("# 1. Balance       #");
        System.out.println("# 2. Deposit       #");
        System.out.println("# 3. Withdraw      #");
        System.out.println("# 4. Exist         #");
        System.out.println("#                  #");
        System.out.println("####################");
    }
     static void menu(){
        
        System.out.println();
        System.out.print("Choose the number : ");
        int value = sc.nextInt();


        switch (value) {
            case 1:
                no1();
                break;
            case 2:
                no2();
                break;
            case 3:
                no3();
                break;
                
            case 4:
                isMenu = false;
                break;
        
            default:
            System.out.println("Input Invalid");
                break;
        }
    }
    static void no1() {
        System.out.println();
        System.out.printf("Your balance is %c %,.2f", symbol, Balance);
        System.out.println();
    }
    static void no2(){
        System.out.println();
        System.out.print("Enter the deposit amount : "+symbol+" ");
        int dpo = sc.nextInt();
        Balance += dpo;
    }
    static void no3(){
        System.out.println();
        System.out.print("Enter the withdraw amount : "+symbol+" ");
        int wd = sc.nextInt();
        if(wd>Balance){
            System.out.println("Error the balance is lacking");
            no3();
        }else{
            Balance-=wd;
            System.out.println("Success");
        }


    }
}
