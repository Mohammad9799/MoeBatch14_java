package Moe;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        boolean odd= n1.length()%2==1;
        if (odd){
            if (n1.length()>5){
                String mid=n1.substring(n1.length()/2-1,n1.length()/2+2);
                System.out.println(mid.isEmpty());
            }
        }





    }
}
