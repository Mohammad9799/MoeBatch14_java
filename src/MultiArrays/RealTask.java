package MultiArrays;

public class RealTask {
    public static void main(String[] args) {



        int [][] numbers ={{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
        int biggestNumber=numbers[0][0];

        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers[i].length; j++){
                if (numbers[i][j]>biggestNumber){
                    biggestNumber = numbers[i][j];
                }

                System.out.println(numbers[i][j]);
            }


        }
    }
}
