package TheTaskes;

public class FirstOne {
    public static void main(String[] args) {
//        fullWord("day","name");

        System.out.println(fullWord("day","name",4));
    }
    public static String fullWord(String firstWord, String secondWord){
        System.out.println(firstWord+secondWord+firstWord);
return firstWord;
    }
    public static String fullWord(String firstWord,String secondWord,int times){
        if (times<=0){
            return "";
        }

        String word= "";
        for (int i=0; i<times; i++){
            word+=firstWord;

            if (i == times-1){
                break;
            }
            word+=secondWord;


        }
        return word;
    }

}
