package loops;

public class LoopsOdd {
    public static void main(String[] args) {

        for (int i=0 ; i<=50; i++){

            if(i==20){
                i = 29;
                continue;
            }






            if(i % 2 == 1 ){
                System.out.println(i);
            }else {
                System.out.println("Even number is here");
            }
        }





    }
}
