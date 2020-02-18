package Scanner;
import java.util.Scanner;
public class Data {
    public static void main(String[] args) {
//
//        String name = "James";
//        String lastName = "Bond";
//        int age = 45;
//        String location = "London, UK";
//        boolean isHeOk = true;


        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = input.nextLine();
        System.out.println("Welcome, "+ name + "!");
        System.out.println("Where you from " + name + "?");
        String location= input.nextLine();
        System.out.println("That's so cool !!!");
        System.out.println( name+ " how old are you ? ");
        String age =input.nextLine();
        System.out.println(age+ " years is fine");

















    }













}
