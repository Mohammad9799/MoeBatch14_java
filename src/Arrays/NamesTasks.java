package Arrays;

import java.util.Scanner;

public class NamesTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] names =new String[6];

        names[0]= "James";
        names[1]= "Sam";
        names[2]= "Adam";
        names[3]= "Elize";
        names[4]= "Jamie";
        names[5]= "Sandy";

        for (int i=0; i<names.length; i++) {

            int last = names[i].length() - 1;
            System.out.println(names[i].charAt(last));
            System.out.println("---------------------");
        }

        for (int i=0; i<names.length; i++) {


            if (names[i].endsWith("s")) {
                System.out.println(names[i]);
                System.out.println("-------------------");
            }
        }
        for (int i=0; i<names.length; i++)
            if (names[i].contains("s")) {
                System.out.println(names[i]);
                System.out.println("-----------------");
            }
        for (int i=0; i<names.length; i++) {


            System.out.println("Enter your name: ");
            String name = input.nextLine();

            if (names[i].contains(name)) {
                System.out.println(names[i]);
            }
        }

        }

    }

