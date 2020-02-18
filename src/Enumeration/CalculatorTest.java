package Enumeration;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println(cali(3,5,Calculator.Plus));
    }



    public static double cali(double num1, double num2, Calculator op){

        switch (op){
            case Plus:
              return num1 + num2;

            case Minus:
               return num1-num2;

            case Divide:
                return num1/num2;

            case Multiply:
                if (num2 == 0){
                    System.out.println("You cant divide by 0");
                    return 0;
                }
                return num1*num2;

            case Remainder:
                if (num1 == 0 || num2 == 0){
                    System.out.println("Invalid remainder OP");
                    return 0;
                }
                return num1%num2;
        }
        return 0;
    }
}
