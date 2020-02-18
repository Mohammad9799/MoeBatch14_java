package ExamQ;

public class Palindrom {

    public static void main(String[] args) {
        numberPlaindrom(5115);

    }

    public static void numberPlaindrom(int number){
        int revers = 0;
        int number2 = number;


        while (number > 0){
            int digit = number2 % 10;

            revers = digit + revers * 10;

            number2 = number2/10;
        }

        if (number == revers){
            System.out.println("Number is palindrom");
        }else {
            System.out.println("Is not palindrom");
        }
    }
}
