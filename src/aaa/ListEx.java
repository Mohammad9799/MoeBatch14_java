package aaa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListEx {
    public static void main(String[] args) {

       List<String> cars = new ArrayList<>();



        cars.add("BMW");
        cars.add("Laxes");
        cars.add("TOYOTA");
        cars.add("BMW");
        cars.add("MSII");

        System.out.println(cars);


        for (String car:cars){
            System.out.print( " "+ car );
        }

    }
}
