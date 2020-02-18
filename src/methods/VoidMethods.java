package methods;

public class VoidMethods {
    public static void sayHi() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
    public static void sayBye(){

        for (int j = 0; j<5; j++){
            System.out.println("SayBye");
        }

    }

    public static void main(String[] args) {
     sayHi();
        System.out.println("-----------------");
        sayBye();
    }



}
