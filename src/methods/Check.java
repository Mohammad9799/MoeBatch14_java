package methods;

public class Check {
    public static void main(String[] args) {
        check("name",4);
    }

    public static void check(String str,int number){
        boolean leng = str.length()==number;
        if (leng){
            System.out.println("Equal");
        }else {
            System.out.println("not equal ");
        }
    }
}
