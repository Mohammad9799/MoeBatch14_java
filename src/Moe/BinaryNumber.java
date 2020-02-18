package Moe;

public class BinaryNumber {
    public static void main(String[] args) {

        for(int i =1; i<=500; i++){

            int one = i % 10;
            int a = i /10;
            int two = a % 10;
            int b = a / 10;
            int three = b % 10;

            int result = (one * one * one) +(two * two * two) + (three * three * three);
            if(i == result){
                System.out.println(i);

            }






        }


    }
}
