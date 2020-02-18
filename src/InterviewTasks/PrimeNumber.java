package InterviewTasks;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;

public class PrimeNumber {

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
            return true;
    }

    public static ArrayList<Integer>allPrimeInRange(int range){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i<range; i++){
            if (isPrimeNumber(i)){
                list.add(i);
            }
        }
        return list;
    }


}
