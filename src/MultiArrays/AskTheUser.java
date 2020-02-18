package MultiArrays;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Arrays;
import java.util.Scanner;

public class AskTheUser {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);


        System.out.print("Enter how many groups you like: ");
        int groups=input.nextInt();
       input.nextLine();
        String[][] arr =new String[groups][];

        for (int i=0; i<arr.length; i++) {

            System.out.print("Enter how many student you like in the group: " + (i + 1));
            int students = input.nextInt();
            input.nextLine();

            String[] arr2 = new String[students];

            for (int j = 0; j < arr2.length; j++) {

                System.out.println("Enter name " + (j + 1));
                arr2[j] = input.nextLine();

            }
            arr[i] = arr2;
        }




            System.out.println(Arrays.deepToString(arr));







    }
}
