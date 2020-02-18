package Inheritance;

import Inheritance2.HP;

import java.util.Date;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        HP hp = new HP();

        hp.color = "red";
        hp.memorySize = 512;
        hp.model = "X4";

        hp.turnOn();


    }
}
