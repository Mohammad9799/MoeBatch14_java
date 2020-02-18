package Moe;

import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String [] splitTheSentence=sentence.split(" ");

//        System.out.println(Arrays.toString(splitTheSentence));

        for(int i=splitTheSentence.length-1; i>=0; i--){

            System.out.println(splitTheSentence[i]);
        }



    }
}
