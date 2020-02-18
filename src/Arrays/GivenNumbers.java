package Arrays;

import java.util.Arrays;

public class GivenNumbers {
    public static void main(String[] args) {

        int [] numbers = {1,2,-3,4,-34,55,78,90,33,10};
        int counter=0;

        for(int i =0; i<numbers.length; i++){

        if(numbers[i]%2 ==0) {
            System.out.println(numbers[i]);
            counter++;
        }
        }
        int [] even_numbers = new int [counter];

        for(int i=0, j=0; i<numbers.length; i++){

            if(numbers[i] % 2 == 0) {
                even_numbers[j] = numbers[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(even_numbers));
        }



        }


