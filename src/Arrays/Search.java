package Arrays;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {

        int [] numbers = {45,23,6,-3,66};

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers,-3));



    }
}
