package loops;

public class StringsLoops {
    public static void main(String[] args) {
        String word = "Cybertek";

        for(int i = 0; i<word.length(); i++){
//            if(word.charAt(i)=='b'){
//                String s = word.charAt(i)+ "";
//                System.out.println(s.toUpperCase());


            System.out.println(word.charAt(i) + " " + i);

      }
    }
}
