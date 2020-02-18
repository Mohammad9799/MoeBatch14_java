package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstExample {
    public static void main(String[] args) {
//        ArrayList<String>names=new ArrayList<>();
//        names.add("Mohammad");
//        names.add("Omar");
//        System.out.println(names);

        //How to use List for any Objects.

        ArrayList<Cat>catsForSale =new ArrayList<>();
        Cat cat1=new Cat();
        cat1.color="Red";
        cat1.age=3;

        Cat cat2=new Cat();
        cat2.color="White";
        cat2.age=4;

        catsForSale.add(cat1);
        catsForSale.add(cat2);

        for (int i=0; i<catsForSale.size(); i++){
            System.out.println("Cat#: "+(i+1));
            System.out.println("------");
            System.out.println("Color: "+ catsForSale.get(i).color);
            System.out.println("Age: "+ catsForSale.get(i).age);
            System.out.println("**********************");
        }






    }
}
