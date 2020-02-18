package Arrays;

public class BiggestNumber {
    public static void main(String[] args) {

        int [] numbers = {3,30,15,50,20};
//        numbers [0]= 3;
//        numbers [1]=30;
//        numbers [2]=14;
//        numbers [3]=6;
//        numbers [4]=50;
//        numbers [5]=20;

        int max=numbers[0];

        for (int i=1; i<numbers.length; i++){

            if (numbers[i]>max){
                max=numbers[i];

            }
        }
        System.out.println(max);







    }
}
