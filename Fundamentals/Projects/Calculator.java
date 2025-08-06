package Fundamentals.Projects;
import java.util.Scanner;

public class Calculator {
    static boolean loop = true;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("\n\n#######################");
        System.out.println("#  1. Addition        #");
        System.out.println("#  2. Subtraction     #");
        System.out.println("#  3. Multiplication  #");
        System.out.println("#  4. Division        #");
        System.out.println("#  5. Exit            #");
        System.out.println("#######################");

        System.out.print("\nChoose a number : ");
        int choose = sc.nextInt();
        if (choose == 5) {
            loop = false;
            System.out.println("Exiting...");
            break;
        }else if(!(choose <= 4 && choose >= 1)){
            loop = false;
            System.out.println("Invalid Input");
            break;
        }

        System.out.print("Enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = sc.nextDouble();
        System.out.println(result(num1, num2, choose));
        }
        sc.close();
    }

    static double result(double num1, double num2, int op){
        return  (op == 1) ? num1 + num2 : (op == 2) ? num1 - num2 :  (op == 3) ? num1 * num2 : (op == 4) ? num1 / num2 : null;
    }
}

