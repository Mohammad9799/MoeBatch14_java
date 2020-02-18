package aaa;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        System.out.println(isAanagram("listen","silent"));
    }


    public static boolean isAanagram(String s1 , String s2){


        if(s1.length()!=s2.length()){
    return false;
}
       char [] arr1 = s1.toCharArray();
       char [] arr2 = s2.toCharArray();
       char temp;

       for(int i=0; i<arr1.length; i++){
           for(int j=0; j<arr1.length-1; j++){
               if(arr1[j]>arr1[j+1]){
                   temp = arr1[j];
                   arr1[j] = arr1[j+1];
                   arr1[j+1] = temp;

               }
           }
       }
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2.length-1; j++){
                if(arr2[j]>arr2[j+1]){
                    temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;

                }
            }
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }


       return false ;

    }
}
