package TheTaskes;

import java.util.Arrays;

public class ThreeTask {
    public static void main(String[] args) {
        int []arr={4,2,5,55,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Array(arr));
    }
    public static int Array(int[]arr ){
        int sum=0;
        for(int num :arr){
            String s = num+"";


            if (s.endsWith("5")){
                continue;
            }sum+=num;




        }return sum;
    }
}
