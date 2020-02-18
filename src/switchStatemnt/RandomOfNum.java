package switchStatemnt;
import java.util.Random;
public class RandomOfNum {
    public static void main(String[] args) {
        Random input = new Random();

        int number = input.nextInt(100);
        System.out.println(number);

    }
}
