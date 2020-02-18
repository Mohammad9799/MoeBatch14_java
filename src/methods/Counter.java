package methods;

public class Counter {
    public static void main(String[] args) {
        int [] arr={1,2,4,6,8,9,7,5,1,1} ;
        System.out.println(numbers(arr));
    }
    public static int numbers(int []num){
        int count=0;

        for (int i:num){
            if (i%2==0){
                count++;
            }

        }
        return count;


    }
}
