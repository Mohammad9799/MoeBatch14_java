package InterviewTasks;

public class Aarmstrong2 {
    public static boolean isArmstrong(int number){
        String num = number + "";
        int power = num.length();
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            int digit = Integer.parseInt(num.charAt(i)+"");
            sum += Math.pow(digit,power);
        }
        return sum == number;
    }
}
