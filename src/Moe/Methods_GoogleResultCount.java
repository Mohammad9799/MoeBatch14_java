package Moe;

public class Methods_GoogleResultCount {
    public static void main(String[] args) {

    }


    public static String resultCount(String str){

        //1- split the string with white space " " and store inside of a new array of Strings
        String [] arrStr = str.split(" ");
        //2- get the second word inside of the array (index #1)
        String secondWord = arrStr[1];
        //3- remove the commas from the string
        String removedCommas = secondWord.replace(",", "");
        //4- return value
        return  removedCommas;
    }
}
