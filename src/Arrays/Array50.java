package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Array50 {
    public static void main(String[] args) {
        Random random =new Random();

        int [] numbers =new int[50];

        for (int i=0; i<numbers.length; i++){
             numbers[i] =random.nextInt(100) + 1;

        }

        System.out.println(Arrays.toString(numbers));


    }
}
