package Moe;

import java.util.Scanner;

public class TheID {
    public static void main(String[] args) {
        /*Ask from user his first name, last name, age.
Print out the result («Your name is »+ first name + «Your last name is »
  + last name + «Your age» + age.
(hint - use scanner. Create two strings variables, one int variable)
*/

        Scanner scanner =new Scanner(System.in);

           System.out.println("!!!! Enter you'r Name please !!!! ");

           System.out.print("First name: ");
        String firstName= scanner.nextLine();
           System.out.print("Last name: ");
        String lastName= scanner.nextLine();

           System.out.println("!!! Enter you'r age please !!!");
           System.out.print("Age: ");
        int age= scanner.nextInt();

        System.out.println("You'r Name is: "+ firstName+ " " + lastName + " <<And You'r age is>>: " + age);
        System.out.println("                              Thanks (*_*)");






    }
}
