package exception;


public class Task2 {
    public static void main(String[] args) {
        System.out.println(checkPrime(7));
        System.out.println(checkPrime(10));
    }


    public static boolean checkPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}