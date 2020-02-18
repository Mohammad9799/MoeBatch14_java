package methods;

public class Reversed {
    public static void main(String[] args) {
        System.out.println(reverseString("mohammad"));
    }
    public static String reverseString(String str){

        String reverse= "";

        for (int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);

        }
        return reverse;
    }
}
