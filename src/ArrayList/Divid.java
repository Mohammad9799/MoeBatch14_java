package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Divid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to DIVIDE MY ARRAY");
        System.out.println("Enter a number that will be the size of your array: ");
        int num1 = input.nextInt();

        System.out.println("Enter numbers for your array: ");
        int [] numbers = new int[num1];
        for (int i = 0; i<num1; i++) {
            numbers[i] = input.nextInt();

        }

            System.out.println("The first value of your array is: "+Arrays.toString(numbers));
//
        int[] part1 = Arrays.copyOfRange(numbers,0,numbers.length/2);
        int[] part2 = Arrays.copyOfRange(numbers,numbers.length/2,numbers.length);

        System.out.println("The first half of your array is: " + Arrays.toString(part1));
        System.out.println("The second half of your array is: " + Arrays.toString(part2));





//
    }
}
