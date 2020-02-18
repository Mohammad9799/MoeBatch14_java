package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyCollection {

    public static  ArrayList<String> getString(){
        ArrayList<String> word = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter word: ");
            word.add(scanner.nextLine());
            System.out.println("Are you done Y/N ");
            if (scanner.nextLine().equals("Y")){
                break;
            }
        }

        return word;

    }

    public static  ArrayList<String> filterList(ArrayList<String> words, int size){
        ArrayList<String> newWords = new ArrayList<>();

        for(String s:words){
            if (s.length() == size){
                newWords.add(s);
            }


        }
        return newWords;
    }



    public static ArrayList<String> removeDuplicates(ArrayList<String> words){
        ArrayList<String> newWords = new ArrayList<>();
        for(String s:words){
            if (newWords.contains(s)){
                continue;
            }
            newWords.add(s);
        }
        return newWords;
    }


}
