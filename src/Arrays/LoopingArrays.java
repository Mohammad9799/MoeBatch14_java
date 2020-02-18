package Arrays;

import java.util.Arrays;

public class LoopingArrays {
    public static void main(String[] args) {
        String []names = new String[3];
        names[0]= "mohammad";
        names[1]= "ibrahim";
        names[2]= "ahmed";

        for (int i= 0; i<names.length; i++){
            System.out.println("name "+ (i+1)+ " is " + names[i]);
//            System.out.println(Arrays.toString(names));
        }




    }
}
