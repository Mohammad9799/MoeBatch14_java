package Moe;

import java.util.Scanner;

public class ExtraTasks {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int count=1;
        String checked="";


        System.out.println("Enter word:");

        String str = input.nextLine().toLowerCase();

       String [] split= str.split("");
        for (int i=0; i<split.length;i++){
            if (!checked.contains(split[i])) {
                for (int j = 0; j < split.length; j++) {


                    if (split[i].equals(split[j]) && i != j) {
                        count++;
                    }


                }
                System.out.print(split[i] + ":" + count +" ");
                checked += split[i];
                count = 1;
            }

        }







    }
}
