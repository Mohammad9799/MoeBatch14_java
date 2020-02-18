package Moe;

public class EndWith {
    public static void main(String[] args) {

        String str = "Hello";
        boolean front = false;


        char lastChar= str.charAt(str.length()-1);
        char firstChar= str.charAt(0);

        if (str==front+""){
            System.out.println(lastChar);
        }else {
            System.out.println(firstChar);
        }








    }
}
