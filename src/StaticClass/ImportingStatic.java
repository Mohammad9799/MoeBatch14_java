package StaticClass;

import java.util.Arrays;
import static StaticClass.Pi.*;

public class ImportingStatic {

    public static void main(String[] args) {

        int [] arr ={3,2,1,4,60};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(PI);


    }

}
