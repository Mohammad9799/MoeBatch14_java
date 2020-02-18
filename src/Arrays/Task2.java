package Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        double [] numbers= new double[4];

        numbers[0]= 45.99;
        numbers[1]= 23.5;
        numbers[2]= 33.33;
        numbers[3]= 99.99;
        System.out.println(Arrays.toString(numbers));
        numbers[numbers.length-1]= 122.89;
        System.out.println(Arrays.toString(numbers));





    }
}
