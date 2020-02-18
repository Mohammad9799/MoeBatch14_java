package Moe;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        int[] inhabitants = new int[8];
        int count0Cities = 0;
        int day = 0;
        System.out.println("Day" + day + " " + Arrays.toString(inhabitants));

        while (count0Cities <= 8) {
            day++;
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i]=input.nextInt();
                inhabitants[i] = inhabitants[i] / 2;
            }
            System.out.println("Day" + day + " " + Arrays.toString(inhabitants));

            count0Cities = 1;
            for (int y = 0; y < inhabitants.length; y++) {
                if (inhabitants[y] == 0) {
                    count0Cities++;
                }
            }
        }


    }
}



