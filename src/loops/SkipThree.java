package loops;

import java.util.Scanner;

public class SkipThree {
    public static void main(String[] args) {
        for (int i = 0; i<=50; i++){
//            if (i==3  || i==13 || i==23 || i==33 || i==43){
//                continue;
//            }
            if(i % 10==3){
                continue;
            }
            System.out.println(i);
        }













    }
}
