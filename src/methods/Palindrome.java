package methods;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome("civic"));
    }

    public static String palindrome(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){
            reverse= reverse+str.charAt(i);

        }
        if (reverse.equals(str)){
            return "palindrome";
        }else {
            return "Not Palindrome";
        }
    }
}
