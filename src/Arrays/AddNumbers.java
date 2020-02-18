package Arrays;

import java.util.Arrays;

public class AddNumbers {
    public static void main(String[] args) {

        int [] firstNumbers={4,-2,5,-3,-20,30};
        int [] secondNumbers={2,7,-10,10,-5,2};

        int [] sum = new int[firstNumbers.length];


        for (int i=0; i<firstNumbers.length; i++){

            sum[i]= firstNumbers[i] + secondNumbers[i];
        }

        System.out.println(Arrays.toString(sum));







    }
}
