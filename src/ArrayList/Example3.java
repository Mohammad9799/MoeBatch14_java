package ArrayList;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int [] grades = {15,25,33,35,66,44,78,95,98,1,500};
//        Arrays.sort(grades);
//        System.out.println("Min value: "+ grades[0]);
//        System.out.println("Max value: "+ grades[grades.length-1]);

        int minValue = grades[0];
        int maxValue = grades[0];

        for (int i = 0; i<grades.length; i++) {
            if (maxValue < grades[i]) {
                maxValue = grades[i];
            }
            if (minValue > grades[i]) {
                minValue = grades[i];
            }

        }
        System.out.println("Min Value: "+ minValue);
        System.out.println("Max Value: "+ maxValue);


    }
}
