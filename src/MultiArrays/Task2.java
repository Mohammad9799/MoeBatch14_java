package MultiArrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String [][] names =new String[3][];

        String [] arr1 = {"name1", "name2", "name3","name4"};
        String [] arr2 = {"name1", "name2"};
        String [] arr3 = {"name1", "name2", "name3"};

        names[0]=arr1;
        names[1]=arr2;
        names[2]=arr3;

        System.out.println(Arrays.deepToString(names));




    }
}
