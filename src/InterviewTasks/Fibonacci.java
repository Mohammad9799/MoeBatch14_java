package InterviewTasks;

import java.util.Arrays;

public class Fibonacci {

    public static String allFibonacciInRange(int range){

        int [] arr = new int[range];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i<arr.length; i++){

            arr[i] = arr[i-1] + arr[i-2];
        }
        return Arrays.toString(arr).replace("[","").replace("]","").replace(",","");


    }
}
