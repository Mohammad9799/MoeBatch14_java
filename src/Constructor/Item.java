package Constructor;

public class Item {
    public String name;
    public double price;
    int size;


    public Item(String name, double price){

        this.name=name;
        this.price=price;


// OVER LOAD THE CONSTRUCTOR THAT TAKES 3 PARAMETER TO SET ALL 3 INSTANCE VARIABLES
    }
    public Item(String name , double price, int size){
        this.name=name;
        this.price=price;
        this.size=size;
    }

    // WE CAN CALL CONSTRUCTOR INSIDE ANOTHER CONSTRUCTOR.
    // IT IS CALLED CONSTRUCTOR CHAINING.
    // WE CAN DO IT USING KEYWORD 'THIS' WITH THE PARENTHESIS

    public void info(){
        System.out.println("\nName: "+ this.name);
        System.out.println("Price: "+ this.price);
    }



}
