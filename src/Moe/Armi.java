package Moe;

public class Armi {

    public static void main(String[] args) {
        Armstrong(155);

    }


    public static boolean Armstrong (int num){

        String str = num + "";
        int power = str.length();
        int sum = 0;

        for (int i = 0; i<power; i++){
            String eachNumber = str.charAt(i) + "";
            sum += Math.pow(Integer.valueOf(eachNumber),power);

        }
        if (num == sum){
            System.out.println("Armstrong");
            return true;
        }else {
            System.out.println("Not Armstrong");
            return false;
        }

    }


}
