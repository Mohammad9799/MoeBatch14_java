package ArrayList;

import java.util.Arrays;

public class Showes {
    public static void main(String[] args) {
        String [] shows={"Friends","Game of Thrones",
                "Doctor Who","Greys Anatomy","Prison Break"};
        Arrays.sort(shows);

        for(int i = 0; i<shows.length; i++){
            System.out.println("#"+ i + " "+ shows[i]);
        }
    }
}
