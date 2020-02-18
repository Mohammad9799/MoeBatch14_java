package Scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Please enter word:");
        Scanner input = new Scanner(System.in);
        String n1 = input.nextLine();

        String x = n1.substring(0, 1);
        String xx = n1.substring(0, 2);
        String xxx = n1.substring(1, 2);

        if (x.equals("x")) {
            System.out.println(n1.substring(1));

        }else if (xx.equals("xx")) {
            System.out.println(n1.substring(2));

        }else if (xxx.equals("x")){
            System.out.println(n1.substring(0,1) + n1.substring(2));
        }













    }
}
