package methods;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        maxNumber(3,4,2,40,12,4,23,7);
    }
    public static void maxNumber(int ... arr){
        Arrays.sort(arr);
        System.out.println("The biggest number is "+ arr[arr.length-1]);
    }
}
