package Moe;

public class a {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }

    public static boolean isPalindrome(int num) {
        String revers = num + "";
        String res = "";

        for (int i = revers.length() - 1; i >= 0; i--) {
            res += revers.charAt(i) + "";
        }
        if (num == Integer.valueOf(res)) {
            return true;
        }

        return false;
    }

}

    

