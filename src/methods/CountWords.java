package methods;

public class CountWords {
    public static void main(String[] args) {
        words("bluha bluha bluha");
    }

    public static void words (String numbersOfWord){
        String [] arr=numbersOfWord.trim().split(" ");


        System.out.println("The number of words in the sentence is: " +arr.length);


    }
}
