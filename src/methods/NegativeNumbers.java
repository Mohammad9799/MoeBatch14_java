package methods;

import java.util.Arrays;

public class NegativeNumbers {
    public static void main(String[] args) {
        int [] arr ={-1,-2,5,6,8,-8,-6};
//        negative(arr);
        changeNegativeNumbers(arr,8000);
    }

    public static void negative(int []arr){
       for (int num:arr) {

            if (num<0) {
            System.out.println(num);
           }
       }
    }


    public static void changeNegativeNumbers(int [] arr, int change){

        for(int i=0; i<arr.length; i++){
            if (arr[i]<0){
                arr[i]=change;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
