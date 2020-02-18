package methods;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(cali("+",5,6));
    }
    public static double cali (String operator, double num1, double num2){
       switch (operator){
           case "+":
               return num1+num2;
           case "-":
               return num1-num2;
           case "*":
               return num1*num2;
           case "/":
               return num1/num2;
           case "%":
               return num1%num2;
           default:
               System.out.println("Invalid operator ");
               return 0;
       }

    }
}
