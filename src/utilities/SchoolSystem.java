package utilities;

import WrapperClass.MagicNumber;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SchoolSystem {
    public static void main(String[] args) {
       ArrayList<String> w = MyCollection.getString();

        System.out.println("\n" + w);

        System.out.println(MyCollection.removeDuplicates(w));



    }

}
