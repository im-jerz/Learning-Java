package Fundamentals.Projects;
import java.util.Scanner;


public class Grading {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many courses you have? : ");
        int numberOfcourses = sc.nextInt();
        int[] arr = new int[numberOfcourses];
        for(int i =0; i<numberOfcourses;i++){
            System.out.printf("Enter you grade in course %d : ", i+1);
            arr[i] =sc.nextInt();
        }
        double sum = 0;
        for(int i =0; i<numberOfcourses;i++){
            sum +=arr[i];
        }
        double total = sum / numberOfcourses;

        System.out.println(Math.round(total));

        if(Math.round(total) == 100 ||Math.round(total) == 99 ){
            System.out.println("You pass and your gwa is 1.00");
        }else if(Math.round(total) == 98 ||Math.round(total) == 97 ){
            System.out.println("You pass and your gwa is 1.25");
        }else if(Math.round(total) <= 96 && Math.round(total) >= 94 ){
            System.out.println("You pass and your gwa is 1.50");
        }else if(Math.round(total) <= 93 && Math.round(total) >= 90 ){
            System.out.println("You pass and your gwa is 1.75");
        }else if(Math.round(total) <= 89 && Math.round(total) >= 87 ){
            System.out.println("You pass and your gwa is 2.00");
        }else if(Math.round(total) <= 86 && Math.round(total) >= 84 ){
            System.out.println("You pass and your gwa is 2.25");
        }else if(Math.round(total) <= 83 && Math.round(total) >= 81 ){
            System.out.println("You pass and your gwa is 2.50");
        }else if(Math.round(total) <= 80 && Math.round(total) >= 78 ){
            System.out.println("You pass and your gwa is 2.75");
        }else if(Math.round(total) <= 77 && Math.round(total) >= 75 ){
            System.out.println("You pass and your gwa is 3.00");
        }else if(Math.round(total) <= 74 && Math.round(total) >= 0 ){
            System.out.println("You fail and your gwa is 5.00");
        }else{
            System.out.println("You are NOT enrolled");
        }


        sc.close();
    }
}
