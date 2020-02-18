package Scanner;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();

        int count = 0;
        a+= b;
        count++;



        System.out.println(a + " after being incremented by " + b + count + " times");
        a+= b;
        count++;
        System.out.println(a + " after being incremented by " + b + count + " times");
        a+= b;
        count++;
        System.out.println(a + " after being incremented by " + b + count + " times");
        a+= b;
        count++;












    }
}
