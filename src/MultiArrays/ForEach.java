package MultiArrays;

import TheTaskes.FirstOne;

public class ForEach {
    public static void main(String[] args) {

        int[][] numbers ={{1,2,3},{2,5,8,9,6},{6,8,9}};

        for (int [] inner : numbers){

            for (int number:inner){
                System.out.print(number);
            }
            System.out.println();
        }

    }
}
