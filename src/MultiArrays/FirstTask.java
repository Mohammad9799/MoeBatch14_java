package MultiArrays;

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int [][] numbers= {{1,2,3},{5,1,2,3,6},{1,6}};

        for (int i=0; i<numbers.length; i++){
                System.out.println("length of the row "+i +" : "+numbers[i].length);
        }
    }
}
