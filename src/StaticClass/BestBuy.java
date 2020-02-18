package StaticClass;

import jdk.dynalink.beans.StaticClass;

public class BestBuy {
    String location;

        static int numOfComputers;


        static {
            System.out.println("Run first");
            numOfComputers=50;
        }

        static {
            numOfComputers = 100;
        }



        public static void printComputer(){
            System.out.println(numOfComputers);
        }







}
