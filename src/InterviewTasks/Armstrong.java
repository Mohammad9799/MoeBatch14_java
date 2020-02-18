package InterviewTasks;

public class Armstrong {

    public static void main(String[] args) {
        int number = 153;
        int check = number;
        int r ;
        int sum = 0;

        while (number>0) {
            r = number % 10;
            number = number / 10;
            sum = sum + r * r * r;
        }
        if (check==sum)
            System.out.println("Is Armstrong Number");
        else
            System.out.println("Is Not Armstrong Number");




    }

}
