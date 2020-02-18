package ArrayList;

import java.util.Arrays;

public class grocer {
    public static void main(String[] args) {

        String[] groceryList = {"apple","carrot","orange","cherry","strawberry"};
        Arrays.sort(groceryList);

        System.out.println("Index number of apple: "+Arrays.binarySearch(groceryList,"apple"));



    }
}
