package Moe;

public class BurgerTask {
    public static void main(String[] args) {
//Burger with fries
        String str1="Burger with fries";
        String str2="Burger with mushed potato";

        if (str1.equals(str2)){
            System.out.println("What?");
        }else {
            System.out.println("Yes they are different");
        }

        if (str1.contains("Burger") && str2.contains("Burger")){
            System.out.println("You eat too much burgers");
        }else {
            System.out.println("Good for you");
        }




    }
}
