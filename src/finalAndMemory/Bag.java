package finalAndMemory;

public class Bag {

   final String color;

    final static int totalBags;

    static {
        totalBags = 45;
    }

    public Bag(){
        this.color = "red";
    }

    public Bag(String color){
        this.color = color;
    }


}
