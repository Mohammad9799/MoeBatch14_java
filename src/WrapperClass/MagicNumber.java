package WrapperClass;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {
    ArrayList<Integer> listOfIntegers = new ArrayList<>();

    public void generateNumbers(int size) {
        listOfIntegers.clear();
        Random random = new Random();

        for (int i = 0; i < size; i++) {

           listOfIntegers.add(random.nextInt(1000));
        }
    }

public void generateEvens(int size){
        Random random=new Random();
        listOfIntegers.clear();
        while (true){
            int i= random.nextInt(100);
            if (i%2==0){
                listOfIntegers.add(i);
            }
            if (listOfIntegers.size()==size){
                break;
            }


        }




}





}
