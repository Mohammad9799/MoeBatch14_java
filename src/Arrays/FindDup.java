package Arrays;

public class FindDup {
    public static void main(String[] args) {

        int [] num = {1,2,3,3,6,7,7,8,9,10};

        for(int i = 0; i<num.length-1; i++){
            if (num[i] != num[i+1]){

            }else
                System.out.println(num[i]);
        }




    }
}
