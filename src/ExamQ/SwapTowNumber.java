package ExamQ;

public class SwapTowNumber {
    public static void main(String[] args) {


    }
    public static void swapTwoNumbers(int a, int b){


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " "+ b);

    }

}
