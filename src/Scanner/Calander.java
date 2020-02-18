package Scanner;

import java.util.Scanner;

public class Calander {
    public static void main(String[] args) {



        Scanner input= new Scanner(System.in);

        System.out.println("What is Today?");
        int Today=input.nextInt() ;
        System.out.println("What is the Month?");
        int Month=input.nextInt();
        System.out.println("What is the Year?" );
        int Year=input.nextInt() ;
        String result=input.nextLine();
        System.out.println(Today + "/" + Month + "/" + Year);
    }


















}
