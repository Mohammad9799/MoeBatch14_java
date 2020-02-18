package ifElseStatements;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mass in kilogram: ");
        double kilograms= input.nextDouble();
        System.out.println("Enter your height in meters: ");
        double meters= input.nextDouble();
        double bmi =kilograms/(meters*meters);
        if (bmi<18.5){
            System.out.println("Underweight!!");
        }
        else if (bmi>=18.5 && bmi<25){
            System.out.println("Normal weight!!");
        }
        else if (bmi>=25 && bmi<30){
            System.out.println("Over weight");
        }
        else if (bmi>=30){
            System.out.println("Obese");

        }
    }
}
