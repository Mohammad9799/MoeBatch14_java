package methods;

public class helloMathods {

    public static void sayHello(){
        for (int i =0; i<=50; i++ ) {
            System.out.println( i+1 +"-"+"Hello");
        }
    }
    public static void hunderdTimes(){
        for (int j=0; j<=100; j++){
            if (j%2==1){
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        sayHello();
        hunderdTimes();
    }
}
