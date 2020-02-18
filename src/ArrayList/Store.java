package ArrayList;

import Constructor.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

// name, address, list of Item, number of items.

    String name;
    String address;
    int numberOfItems;
    ArrayList<Item> listOfItems;
    double totalSales;


    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public void addItem(Item item) {
   this.listOfItems.add(item);
        numberOfItems++;
    }
    public void addItem() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many items to like to enter: ");
        int numbers = input.nextInt();
        input.nextLine();

        for (int i=0;i<numbers;i++){

            System.out.println("Enter the name for item#: "+(i+1));
            String name = input.nextLine();

            System.out.println("Enter the price for item#: "+(i+1));
            double price = input.nextDouble();
            input.nextLine();

            Item item = new Item(name, price);

            this.listOfItems.add(item);
            this.numberOfItems++;

        }
    }

    public void sellItem(String names){

        for (int i=0; i<listOfItems.size(); i++){

            if (listOfItems.get(i).name.equals(names)){
                this.totalSales +=listOfItems.get(i).price;
                listOfItems.remove(i);
                System.out.println("successful transaction!!");
                this.numberOfItems--;
                return;
            }
        }
        System.out.println("Item is not in stock");

    }

    public void returnItem(String itemName){

        Scanner input =new Scanner(System.in);
        System.out.println("Enter price of the item: ");
        double itemPrice = input.nextDouble();
        Item item=new Item(itemName,itemPrice);
        listOfItems.add(item);
        this.totalSales-=itemPrice;
        this.numberOfItems++;
        System.out.println("\nReturn process successful.");









    }




    public void seeInventory() {
        for (Item item : listOfItems) {
            item.info();
        }
    }


    }