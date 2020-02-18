package exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] arr ={1,2,3,4,5};

       try{
           System.out.println("Enter your Index you want to chane");
           int index = input.nextInt();
           input.nextLine();
           System.out.println("enter the number you want to add ");
           int number = input.nextInt();
           arr[index] = number;

       }catch (InputMismatchException e){
           System.out.println("Invalid number entered !!!");
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Entered in valid number ");
       }finally {
           System.out.println(Arrays.toString(arr));
       }







    }



}
