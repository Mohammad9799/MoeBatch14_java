package Moe;

import java.util.Arrays;

public class FindAmissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        Ex(arr);

    }

    public static void Ex(int[] nums) {

       int k = nums[0];

       for (int i = 0; i<nums.length; i++ , k++){
           while (nums[i] != k){
               System.out.println(k );
               k++;

           }
           System.out.println(nums[i]);
       }


    }
}