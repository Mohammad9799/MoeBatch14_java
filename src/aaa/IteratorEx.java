package aaa;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Mohammad");
        names.add("Nassim");
        names.add("Ahamed");
        names.add("Olaga");


        Iterator <String> it = names.iterator();

        while (it.hasNext()){

            String name = it.next();

            System.out.println(name);
        }



    }
}
