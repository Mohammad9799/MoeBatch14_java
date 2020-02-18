package methods;

public class DataTypePromotion {
    public static void main(String[] args) {
        int a= 45;
        calc(a);
    }
    public static void calc(double d){
        System.out.println("Using double");
    }
    public static void calc(float f){
        System.out.println("Using float");
    }
}
