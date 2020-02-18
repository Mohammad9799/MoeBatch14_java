package WhileLoop;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1500;
        int transBal;
        int dec=0;

//        System.out.println("Enter the cost of item: ");

//        int cost = input.nextInt();
        while (balance>0){
            System.out.println("Enter the cost of item: ");
           transBal=input.nextInt();

           if (transBal<=balance){
               System.out.println("Item purchased");
               balance -=transBal;
           }else {
               System.out.println("Card declined");
               dec++;

           }if (dec==3){
                System.out.println("YOUR CARD IS LOCKED!!!!!!!!!!");
                 break;
            }






        }









    }
}
