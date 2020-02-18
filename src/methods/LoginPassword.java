package methods;

public class LoginPassword {
    public static void main(String[] args) {
        System.out.println(stringuser("james232","123456789"));
    }
    public static boolean stringuser(String str,String pass){
        String a ="james232";
        String b="123456789";

        if (str.equals(a) && pass.equals(b)){
           return true;
        }else {
            return false;
        }

    }
}
