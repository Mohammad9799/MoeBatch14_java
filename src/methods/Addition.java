package methods;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class Addition {
    public static void main(String[] args) {
        //9,8,4,3,2,6,3
        numbers("9843263",5);

    }

    public static void numbers(String number, int add){

        String [] arr =number.split("");

        int [] intArray = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            intArray[i] = Integer.valueOf(arr[i])+ add;
        }


        System.out.println(Arrays.toString(intArray));
    }
}
