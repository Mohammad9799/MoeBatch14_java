package Avangers;

import java.util.Scanner;

public class TheFirstTask {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your word please: ");

        String word=scanner.nextLine();


        if (word.length()%2==1){

            word= word.toLowerCase();// to lower case the whole word!!

            int mid= word.length()/2;// to get the mid letters in the word!!

            String first = word.substring(0,mid);// to get the first part of the word
            String middle = word.charAt(mid)+""; // to get the
                  middle= middle.toUpperCase();
            String last= word.substring(mid+1);

            System.out.println(first + middle +last);
        }else {// By saying else, the computer know by itself its an even number
            word= word.toLowerCase();
            int mid = word.length()/2; // to divide the word
            int theFirstMid= mid-1;// to get the first have

            String first =word.substring(0,theFirstMid); // this is the first part
            String middle = word.substring(theFirstMid,mid+1).toUpperCase(); // this include the first middle and 2nd
            String last = word.substring(mid+1); // this is the rest of the word

            System.out.println(first+middle+last);


        }



    }
}
