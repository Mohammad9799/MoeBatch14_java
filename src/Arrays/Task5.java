package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String [] names=new String[5];

        for(int i = 0; i<names.length; i++){
            System.out.println("ENTER NAME " + (i+1));

            names[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(names));






    }
}
