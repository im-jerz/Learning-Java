package Fundamentals;
public class Printing {
    public static void main(String[] args){
        System.out.print("Hello ");// without new line
        System.out.print("World\n");

        System.out.println("Hello World!");
        String name = "im-jerz";
        System.out.println(name);
        
        //%[flag][width][.precision][specifier-character]

        System.out.printf("Hello %s\n", name);

        float fnumber = 2000.45f;

        System.out.printf("The number is %,.1f\n", fnumber);

        int a1 = 1;
        int a2 = 12;
        int a3 = 123;
        int a4 = 1234;

        System.out.printf("%4d\n",a1);
        System.out.printf("%4d\n",a2);
        System.out.printf("%4d\n",a3);
        System.out.printf("%4d\n",a4);
    }
}
