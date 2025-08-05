package Fundamentals;

public class Variables{
    public static void main(String[] args){

        //primitive variables
        byte oH = 2; // -128 to 127
        short oT = 5000; // -32,768 to 32,767\
        int oB = 12; //-2³¹ to 2³¹-1 (~±2.1 billion)
        long oL = 12342L; //-2⁶³ to 2⁶³-1
        float dS = 12.9f; //~±3.4e38 (6-7 decimal digits)
        double dF = 3.1411; //~±1.7e308 (15 decimal digits)
        char c = 'A'; //Unicode (0 to 65,535)
        boolean torf = true; //true or false


        //Reference
        String name = "im-jerz";
        int[] arr = {1,2,3};

        System.out.println(oH);
        System.out.println(oT);
        System.out.println(oB);
        System.out.println(oL);
        System.out.println(dS);
        System.out.println(dF);
        System.out.println(c);
        System.out.println(torf);
        System.out.println(name);
        System.out.println(arr[0]);
    }
}