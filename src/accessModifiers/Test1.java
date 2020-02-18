package accessModifiers;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person();

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("ENTER THE AGE: ");
            int age = input.nextInt();
            if (age > 0 && age < 120){
                p1.setAge(age);
                break;
            }
        }while (true);




    }
}
