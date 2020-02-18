package Constructor;

import java.util.Scanner;

public class TheMarket {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter how many item you have please: ");
        int numberOfTheItems = input.nextInt();

        input.nextLine();


        Item [] cart= new Item[numberOfTheItems];

        for(int i=0; i<cart.length; i++){
            System.out.println("Name of the item: "+ (i+1));
            String name=input.nextLine();

            System.out.println("Price of the item: "+ (i+1));
            double price= input.nextDouble();
            input.nextLine();


            cart[i] =new Item(name,price);
        }
        for (Item item:cart){
            item.info();
        }







    }
}
