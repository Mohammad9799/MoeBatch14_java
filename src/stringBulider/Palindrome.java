package stringBulider;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
    }

    public static boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        if (word.equals(sb.toString())){
            return true;
        }else{
            return false;

        }
    }


}
