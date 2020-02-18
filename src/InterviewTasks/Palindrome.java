package InterviewTasks;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(10013));
    }

    public static boolean isPalindrome(long number){

        long workingNum = number;
        long reverse = 0;

        while (workingNum != 0 ){

            long last = workingNum  % 10;
            reverse = reverse * 10 + last;

            workingNum /= 10;
        }
        return  number == reverse;

    }
}
