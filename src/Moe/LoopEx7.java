package Moe;

import java.util.Scanner;

public class LoopEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int factor=1;
        int i=1;
        while (i<=num){
          factor*=i;
              i++;
        }
        System.out.print(factor);












        }

}