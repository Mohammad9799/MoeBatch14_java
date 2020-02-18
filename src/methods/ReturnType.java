package methods;

public class ReturnType {

    public static String getDate(){
        return "11/3/2019";
    }

    public static int getThree(){
        return 3;
    }

    public static void main(String[] args) {
        int a =getThree()+12+23;
        System.out.println(a);
        System.out.println(getDate());
    }
}
