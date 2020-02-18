package loops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password= "123456789";


        for (int attemmpts=0; ; attemmpts++ ){
            System.out.println("Enter your password:");
            String pass =input.nextLine();

            if (attemmpts==3){
                System.out.println("your locked");
                break;


            }
            if (pass.equals(password)){
                System.out.println("welcome");
                break;
            }
        }

    }
}
