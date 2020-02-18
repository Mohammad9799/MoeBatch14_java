package ArrayList;

import Constructor.Item;

public class Market {
    public static void main(String[] args) {

        Store zara =new Store("Zara","312 main st");

        Item item =new Item("T-shirt",40);
        Item item1= new Item("Socks",15);
        Item item2= new Item("Coat",85);

        zara.addItem(item);
        zara.addItem(item1);
        zara.addItem(item2);

        System.out.println(zara.numberOfItems);
        zara.seeInventory();





    }
}
