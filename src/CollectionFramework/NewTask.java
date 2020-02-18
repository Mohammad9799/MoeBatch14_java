package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("ONE",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);

        System.out.println("Can YOU Please Enter A Number:");
       int num = input.nextInt();

        if (!numbers.containsValue(num)) {
            System.out.println("Invalid Number");
            System.exit(0);

        }


       for (String key:numbers.keySet()){
           if (numbers.get(key) == num){
               System.out.println(key);
               break;
           }
       }




    }
}
