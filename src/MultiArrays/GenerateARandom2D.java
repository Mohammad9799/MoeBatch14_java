package MultiArrays;

import java.util.Arrays;
import java.util.Random;

public class GenerateARandom2D {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generate(4,4)));
    }




    public static int[][] generate(int numbersOfArrays, int numbersOfElemnts) {

        int[][] arr = new int[numbersOfArrays][numbersOfElemnts];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = random.nextInt(100);
            }
        }
        return arr;
    }
}
